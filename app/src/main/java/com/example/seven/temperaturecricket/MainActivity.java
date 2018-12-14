package com.example.seven.temperaturecricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button calc;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        calc = findViewById(R.id.calc);
        textView2 = findViewById(R.id.textView2);
        textView2.setVisibility(View.GONE);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"please enter all fields",Toast.LENGTH_SHORT).show();
                }
                else {
                    int chrips = Integer.parseInt(editText.getText().toString().trim());
                    double temp = (chrips/3.0) +4;
                    String res = "The approximate temprature outside is: " +temp +" degress celsius.";
                    textView2.setText(res);
                    textView2.setVisibility(View.VISIBLE);
                }


            }
        });
    }
}
