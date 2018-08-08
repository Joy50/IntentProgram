package com.joy50.intentprogram;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class PhoneCall extends AppCompatActivity {

    ImageButton call;
    EditText phonenumber;
    String pn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_call);
        call=(ImageButton)findViewById(R.id.imageButton);
        phonenumber=(EditText)findViewById(R.id.editText);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                pn=phonenumber.getText().toString().trim();
                if(pn.isEmpty()){
                    intent.setData(Uri.parse("tel:123456789"));
                }
                else {
                    intent.setData(Uri.parse("tel:"+pn));
                }
                if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
                    req();
                }
                else{
                    startActivity(intent);
                }
            }
        });
    }

    private void req() {
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
    }
}
