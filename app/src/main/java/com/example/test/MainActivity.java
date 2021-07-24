package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et;
    private Button bt;
    private TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        bt.setOnClickListener(this);
    }

    private void init() {
        et = findViewById(R.id.et);
        bt = findViewById(R.id.button);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

    }

    @Override
    public void onClick(View v) {
        int r = Integer.parseInt(et.getText().toString());
        double PI = Math.PI;
        tv1.setText("Dien tich: "+(r*r*PI));
        tv2.setText("Chu vi: "+Math.round(2*PI*r));
    }
}