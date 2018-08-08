package com.joy50.intentprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Implichit_Intent extends AppCompatActivity {

    RadioButton phonecall,camerause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implichit__intent);
        phonecall=(RadioButton)findViewById(R.id.radioButton4);
        camerause=(RadioButton)findViewById(R.id.radioButton5);
        phonecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PhoneCall.class));
            }
        });
        camerause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CameraUse.class));
            }
        });
    }
}
