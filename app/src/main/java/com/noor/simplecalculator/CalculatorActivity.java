package com.noor.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    EditText etxtNumber1,etxtNumber2;
    Button btnPlus,btnSub,btnMulti,btnDiv;
    TextView txtResult;

    public float num1 = 0;
    public float num2 = 0;
    public float result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etxtNumber1=(EditText)findViewById(R.id.etxtNumber1);
        etxtNumber2=(EditText)findViewById(R.id.etxtNumber2);

        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        txtResult=(TextView)findViewById(R.id.txtResult);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberInput();

                result=num1+num2;
                // form the output line
                txtResult.setText(num1 + " " + "+" + " " + num2 + " = " + result);

            }
        });



        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberInput();

                result=num1-num2;
                // form the output line
                txtResult.setText(num1 + " " + "-" + " " + num2 + " = " + result);

            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberInput();

                result=num1*num2;
                // form the output line
                txtResult.setText(num1 + " " + "*" + " " + num2 + " = " + result);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberInput();
                result=num1/num2;
                // form the output line
                txtResult.setText(num1 + " " + "/" + " " + num2 + " = " + result);

            }
        });

    }

    public void numberInput()
    {
        // check if the fields are empty
        if (TextUtils.isEmpty(etxtNumber2.getText().toString())
                || TextUtils.isEmpty(etxtNumber2.getText().toString())) {
            return;
        }

        else {
            // read EditText and fill variables with numbers
            num1 = Float.parseFloat(etxtNumber1.getText().toString());
            num2 = Float.parseFloat(etxtNumber2.getText().toString());
        }
    }
}
