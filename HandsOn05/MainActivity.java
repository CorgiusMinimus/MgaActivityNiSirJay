package com.ravago.handson05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Wendell Lance M. Ravago
    // BSIT3.2A
    // 05 Hands-On Activity 1
    Button btnSwap, btnCheck;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnSwap = (Button)findViewById(R.id.btnSwap);
        btnCheck = (Button)findViewById(R.id.btnCheck);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        Intent i = new Intent(this, CheckOutput.class);


        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et1Val = editText1.getText().toString();
                String et2Val = editText2.getText().toString();
                editText1.setText(et2Val);
                editText2.setText(et1Val);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et1Val = editText1.getText().toString();
                String et2Val = editText2.getText().toString();
                String status = "";
                if (et1Val.equals(et2Val)) {
                    status = "Both values are the same";
                } else if (!(et1Val.equals(et2Val))) {
                    status = "Values are not the same";
                }
                i.putExtra("status", status);
                startActivity(i);
            }
        });
    }
}