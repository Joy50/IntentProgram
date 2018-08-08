package com.joy50.intentprogram;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CameraUse extends AppCompatActivity {

    ImageView pic;
    ImageButton capture;
    static final int CAMERA_REQ=52;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_use);
        pic=(ImageView)findViewById(R.id.imageView);
        capture=(ImageButton)findViewById(R.id.imageButton3);
        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAMERA_REQ);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==CAMERA_REQ&&requestCode== Activity.RESULT_OK){
            Bitmap photo=(Bitmap)data.getExtras().get("data");
            pic.setImageBitmap(photo);
        }
    }
}
