package com.joy50.intentprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Passingvalue extends AppCompatActivity {
    EditText getValue;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passingvalue);
        getValue=(EditText)findViewById(R.id.editText2);
        send=(Button)findViewById(R.id.button2);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gv=getValue.getText().toString();
                Intent intent=new Intent(getApplicationContext(),reciverClass.class);
                intent.putExtra("Value",gv);
                startActivity(intent);
            }
        });
    }
}
