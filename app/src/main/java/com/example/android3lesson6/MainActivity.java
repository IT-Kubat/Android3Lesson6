package com.example.android3lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnApply, btnSub, btnDivide, btnMultiply;
    private EditText operandFirst, operandSecond;
    private TextView tvResult;

    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int open1 = Integer.parseInt(operandFirst.getText().toString());
                int open2 = Integer.parseInt(operandSecond.getText().toString());

                String res = String.valueOf(math.add(open1, open2));
                tvResult.setText(res);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int open1 = Integer.parseInt(operandFirst.getText().toString());
                int open2 = Integer.parseInt(operandSecond.getText().toString());
                String result = String.valueOf(math.sub(open1, open2));
                tvResult.setText(result);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int open1 = Integer.parseInt(operandFirst.getText().toString());
                int open2 = Integer.parseInt(operandSecond.getText().toString());
                String response = String.valueOf(math.multiply(open1, open2));
                tvResult.setText(response);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int open1 = Integer.parseInt(operandFirst.getText().toString());
                int open2 = Integer.parseInt(operandSecond.getText().toString());
                String answer = String.valueOf(math.div(open1, open2));
                tvResult.setText(answer);
            }
        });
    }

    private void init() {
        btnApply = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnDivide = findViewById(R.id.btn_div);
        btnMultiply = findViewById(R.id.btn_multiply);
        operandFirst = findViewById(R.id.et_operand_first);
        operandSecond = findViewById(R.id.et_operand_second);
        tvResult = findViewById(R.id.tv_result);
        math = new Math();

    }

}