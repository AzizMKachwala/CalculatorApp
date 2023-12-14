package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calc extends AppCompatActivity implements View.OnClickListener {

    EditText etvNum;
    String sym = "";
    Double no1 = 0.0, no2 = 0.0, ans = 0.0;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnD, btnAdd, btnSub, btnMul, btnDiv, btnEq, btnCl, btnMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        etvNum = findViewById(R.id.etvNum);
        btnAdd = findViewById(R.id.btnAddition);
        btnSub = findViewById(R.id.btnSubtraction);
        btnMul = findViewById(R.id.btnMultiplication);
        btnDiv = findViewById(R.id.btnDivision);
        btnEq = findViewById(R.id.btnEqual);
        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btnThree);
        btn4 = findViewById(R.id.btnFour);
        btn5 = findViewById(R.id.btnFive);
        btn6 = findViewById(R.id.btnSix);
        btn7 = findViewById(R.id.btnSeven);
        btn8 = findViewById(R.id.btnEight);
        btn9 = findViewById(R.id.btnNine);
        btn0 = findViewById(R.id.btnZero);
        btnD = findViewById(R.id.btnDot);
        btnCl = findViewById(R.id.btnClear);
        btnMod = findViewById(R.id.btnModulus);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEq.setOnClickListener(this);
        btnCl.setOnClickListener(this);
        btnMod.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnD.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String temp;
        if (view.equals(btn1)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("1");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "1");
            }
        } else if (view.equals(btn2)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("2");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "2");
            }
        } else if (view.equals(btn3)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("3");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "3");
            }
        } else if (view.equals(btn4)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("4");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "4");
            }
        } else if (view.equals(btn5)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("5");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "5");
            }
        } else if (view.equals(btn6)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("6");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "6");
            }
        } else if (view.equals(btn7)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("7");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "7");
            }
        } else if (view.equals(btn8)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("8");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "8");
            }
        } else if (view.equals(btn9)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("9");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "9");
            }
        } else if (view.equals(btn0)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText("0");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + "0");
            }
        } else if (view.equals(btnD)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                etvNum.setText(".");
            } else {
                temp = etvNum.getText().toString().trim();
                etvNum.setText(temp + ".");
            }
        } else if (view.equals(btnAdd)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                no1 = 0.0;
            } else {
                no1 = Double.valueOf(etvNum.getText().toString().trim());
                sym = "+";
                etvNum.setText("0");
            }
        } else if (view.equals(btnSub)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                no1 = 0.0;
            } else {
                no1 = Double.valueOf(etvNum.getText().toString().trim());
                sym = "-";
                etvNum.setText("0");
            }
        } else if (view.equals(btnMul)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                no1 = 0.0;
            } else {
                no1 = Double.valueOf(etvNum.getText().toString().trim());
                sym = "*";
                etvNum.setText("0");
            }
        } else if (view.equals(btnCl)) {
            etvNum.getText().clear();
        } else if (view.equals(btnDiv)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                no1 = 0.0;
            } else {
                no1 = Double.valueOf(etvNum.getText().toString().trim());
                sym = "/";
                etvNum.setText("0");
            }
        } else if (view.equals(btnMod)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                no1 = 0.0;
            } else {
                no1 = Double.valueOf(etvNum.getText().toString().trim());
                sym = "%";
                etvNum.setText("0");
            }
        } else if (view.equals(btnEq)) {
            if (etvNum.getText().toString().trim().equals("") || etvNum.getText().toString().trim().equals("0")) {
                no2 = 0.0;
            } else {
                no2 = Double.valueOf(etvNum.getText().toString().trim());
                if (sym.equals("+")) {
                    ans = no1 + no2;
                    etvNum.setText("" + ans);
                }
                if (sym.equals("-")) {
                    ans = no1 - no2;
                    etvNum.setText("" + ans);
                }
                if (sym.equals("*")) {
                    ans = no1 * no2;
                    etvNum.setText("" + ans);
                }
                if (sym.equals("/")) {
                    ans = no1 / no2;
                    etvNum.setText("" + ans);
                }
                if (sym.equals("%")) {
                    ans = (no1/100)*no2;
                    etvNum.setText("" + ans);
                }
            }

        }
    }
}
