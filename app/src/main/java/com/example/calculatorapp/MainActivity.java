package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etvNumberOne, etvNumberTwo;
    String valueOne, valueTwo;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView txtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etvNumberOne = findViewById(R.id.etvNumOne);
        etvNumberTwo = findViewById(R.id.etvNumTwo);
        btnAdd = findViewById(R.id.btnAddition);
        btnSub = findViewById(R.id.btnSubtraction);
        btnMul = findViewById(R.id.btnMultiplication);
        btnDiv = findViewById(R.id.btnDivision);
        txtRes = findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                valueOne = etvNumberOne.getText().toString().trim();
//                valueTwo = etvNumberTwo.getText().toString().trim();
//
//                if (valueOne.equalsIgnoreCase("")) {
//                    etvNumberOne.setError("Please Enter Number1");
//                    etvNumberOne.requestFocus();
//                } else {
//                    if (valueTwo.equalsIgnoreCase("")) {
//                        etvNumberTwo.setError("Please Enter Number2");
//                        etvNumberTwo.requestFocus();
//                    } else {
//                        int ans = Integer.parseInt(valueOne) + Integer.parseInt(valueTwo);
//                        Toast.makeText(MainActivity.this, "Your Answer for Addition " + ans, Toast.LENGTH_SHORT).show();
//                        String toShow = Integer.valueOf(ans).toString();
//                        txtRes.setText(toShow);
//                    }
//                }
//            }
//        });
//
//        btnSub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                valueOne = etvNumberOne.getText().toString().trim();
//                valueTwo = etvNumberTwo.getText().toString().trim();
//
//                if (valueOne.equalsIgnoreCase("")) {
//                    etvNumberOne.setError("Please Enter Number1");
//                    etvNumberOne.requestFocus();
//                } else {
//                    if (valueTwo.equalsIgnoreCase("")) {
//                        etvNumberTwo.setError("Please Enter Number2");
//                        etvNumberTwo.requestFocus();
//                    } else {
//                        int ans = Integer.parseInt(valueOne) - Integer.parseInt(valueTwo);
//                        Toast.makeText(MainActivity.this, "Your Answer for subtraction " + ans, Toast.LENGTH_SHORT).show();
//                        String toShow = Integer.valueOf(ans).toString();
//                        txtRes.setText(toShow);
//                    }
//                }
//            }
//        });
//
//        btnMul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                valueOne = etvNumberOne.getText().toString().trim();
//                valueTwo = etvNumberTwo.getText().toString().trim();
//
//                if (valueOne.equalsIgnoreCase("")) {
//                    etvNumberOne.setError("Please Enter Number1");
//                    etvNumberOne.requestFocus();
//                } else {
//                    if (valueTwo.equalsIgnoreCase("")) {
//                        etvNumberTwo.setError("Please Enter Number2");
//                        etvNumberTwo.requestFocus();
//                    } else {
//                        int ans = Integer.parseInt(valueOne) * Integer.parseInt(valueTwo);
//                        Toast.makeText(MainActivity.this, "Your Answer for Division " + ans, Toast.LENGTH_SHORT).show();
//                        String toShow = Integer.valueOf(ans).toString();
//                        txtRes.setText(toShow);
//                    }
//                }
//            }
//        });
//
//        btnDiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                valueOne = etvNumberOne.getText().toString().trim();
//                valueTwo = etvNumberTwo.getText().toString().trim();
//
//                if (valueOne.equalsIgnoreCase("")) {
//                    etvNumberOne.setError("Please Enter Number1");
//                    etvNumberOne.requestFocus();
//                }
//                else {
//                    if (valueTwo.equalsIgnoreCase("")) {
//                        etvNumberTwo.setError("Please Enter Number2");
//                        etvNumberTwo.requestFocus();
//                    }
//                    else {
//                        if (valueTwo.equals("0")) {
//                            etvNumberTwo.setError("Number Can't de Divided by 0");
//                            etvNumberTwo.requestFocus();
//                        } else {
//                            double ans = Integer.parseInt(valueOne) / Integer.parseInt(valueTwo);
//                            Toast.makeText(MainActivity.this, "Your Answer for Division " + ans, Toast.LENGTH_SHORT).show();
//                            String toShow = Double.valueOf(ans).toString();
//                            txtRes.setText(toShow);
//                        }
//                    }
//                }
//            }
//        });

    }

    @Override
    public void onClick(View view) {

        valueOne = etvNumberOne.getText().toString().trim();
        valueTwo = etvNumberTwo.getText().toString().trim();

        if (valueOne.equalsIgnoreCase("")) {
            etvNumberOne.setError("Please Enter Number1");
            etvNumberOne.requestFocus();
        } else {
            if (valueTwo.equalsIgnoreCase("")) {
                etvNumberTwo.setError("Please Enter Number2");
                etvNumberTwo.requestFocus();
            } else {
                if (view.equals(btnAdd)) {
                    String sym="+";
                    int ans = Integer.parseInt(valueOne) + Integer.parseInt(valueTwo);
                    String toShow = Integer.valueOf(ans).toString();
                    txtRes.setText(valueOne + " " + sym + " " + valueTwo + " = "+  toShow);
                } else if (view.equals(btnSub)) {
                    String sym="-";
                    int ans = Integer.parseInt(valueOne) - Integer.parseInt(valueTwo);
                    String toShow = Integer.valueOf(ans).toString();
                    txtRes.setText(valueOne + " " + sym + " " + valueTwo + " = "+  toShow);
                } else if (view.equals(btnMul)) {
                    String sym="X";
                    int ans = Integer.parseInt(valueOne) * Integer.parseInt(valueTwo);
                    String toShow = Integer.valueOf(ans).toString();
                    txtRes.setText(valueOne + " " + sym + " " + valueTwo + " = "+  toShow);
                } else if (view.equals(btnDiv)) {
                    if (valueTwo.equals("0")) {
                        etvNumberTwo.setError("Number Can't de Divided by 0");
                        etvNumberTwo.requestFocus();
                    } else {
                        String sym="/";
                        double ans = Integer.parseInt(valueOne) / Integer.parseInt(valueTwo);
                        String toShow = Double.valueOf(ans).toString();
                        txtRes.setText(valueOne + " " + sym + " " + valueTwo + " = "+  toShow);
                    }
                }
            }
        }
    }
}