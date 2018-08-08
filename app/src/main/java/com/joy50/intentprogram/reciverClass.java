package com.joy50.intentprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class reciverClass extends AppCompatActivity {

    TextView strVal;
    String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciver_class);
        strVal=(TextView)findViewById(R.id.textView5);
        val=getIntent().getExtras().getString("Value");
        strVal.setText(val);
    }
}
