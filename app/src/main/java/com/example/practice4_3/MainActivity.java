package com.example.practice4_3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView textResult;
    String num1, num2;
    Float result;

    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n", "MissingInflatedId"})
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnRem = (Button) findViewById(R.id.BtnRem);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().equals("")||edit2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_LONG).show();
                    textResult.setText("계산 결과 : ");
                }
                else {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().equals("")||edit2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_LONG).show();
                    textResult.setText("계산 결과 : ");
                }
                else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().equals("")||edit2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_LONG).show();
                    textResult.setText("계산 결과 : ");
                }
                else {
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과 : " + result);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().equals("")||edit2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_LONG).show();
                    textResult.setText("계산 결과 : ");
                }
                else {
                    if (num2.equals("0")) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다!", Toast.LENGTH_LONG).show();
                        textResult.setText("계산 결과 : ");
                    }
                    else {
                        result = Float.parseFloat(num1) / Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result);
                    }
                }
            }
        });

        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(edit1.getText().toString().equals("")||edit2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_LONG).show();
                    textResult.setText("계산 결과 : ");
                }
                else {
                    if (num2.equals("0")) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다!", Toast.LENGTH_LONG).show();
                        textResult.setText("계산 결과 : ");
                    }
                    else {
                        result = Float.parseFloat(num1) % Float.parseFloat(num2);
                        textResult.setText("계산 결과 : " + result);
                    }
                }
            }
        });

    }
}