package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrimeNo extends AppCompatActivity {

    EditText etvNum;
    Button btnPr, btnCl, btnCalc;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_no);

        etvNum = findViewById(R.id.etvNumPrime);
        btnPr = findViewById(R.id.btnPrimeNo);
        btnCl = findViewById(R.id.btnClearSpace);
        btnCalc = findViewById(R.id.btnCalc);

        btnPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = etvNum.getText().toString().trim();

                if (!value.isEmpty()) {
                    int num = Integer.parseInt(value);
                    boolean isPrime = PrimeChecker.isPrime(num);
                    String result = isPrime ? "is Prime" : "is Not Prime";
                    Toast.makeText(PrimeNo.this, num + " " + result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrimeNo.this, MainActivity.class));
                finish();
            }
        });

        btnCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etvNum.getText().clear();
                Toast.makeText(PrimeNo.this, "Cleared", Toast.LENGTH_SHORT).show();
            }
        });
    }
}