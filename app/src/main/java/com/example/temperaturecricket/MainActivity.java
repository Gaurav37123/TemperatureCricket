package com.example.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btCalc;
    EditText etChirps;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCalc = findViewById(R.id.btCalc);
        etChirps = findViewById(R.id.etChirps);
        tvResult = findViewById(R.id.tvResult);
        tvResult.setVisibility(View.GONE);
        btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String svalue;
                svalue = etChirps.getText().toString().trim();
                int value = Integer.parseInt(svalue);
                int temp;
                temp = value/3 + 4 ;
                tvResult.setVisibility(View.VISIBLE);
                tvResult.setText("Absolute temperature around you is " + temp + " *C");
            }
        });
    }
}
