package com.ravago.handson05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CheckOutput extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_output);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txt = (TextView) findViewById(R.id.txtOutput);
        String output = getIntent().getStringExtra("status");
        txt.setText(output);
    }
}