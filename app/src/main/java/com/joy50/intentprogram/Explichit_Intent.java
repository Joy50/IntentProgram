package com.joy50.intentprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Explichit_Intent extends AppCompatActivity {

    RadioButton passingValue,anotherApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explichit__intent);
        passingValue=(RadioButton)findViewById(R.id.radioButton5);
        anotherApp=(RadioButton)findViewById(R.id.radioButton6);
        passingValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Passingvalue.class));
            }
        });
        anotherApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AnotherApp.class));
            }
        });
    }
}
