package com.example.adolfohinojosa.practica5intentimplicito;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
    }


    @Override
    /*PARA ABRIR LA APLICACION*/
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.btn1:
                Intent it1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:8711670388"));
                startActivity(it1);
                break;

            case R.id.btn2:
                Intent itc=new Intent(Intent.ACTION_CALL,Uri.parse("tel:8711670388"));
                startActivity(itc);
                break;

            case R.id.btn3:
                Intent it3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://xvideos.com"));
                startActivity(it3);
                break;
        }
    }




}
