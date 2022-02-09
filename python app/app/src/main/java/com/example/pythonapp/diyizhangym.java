package com.example.pythonapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class diyizhangym extends AppCompatActivity {
    public Button zhuye,xiazhang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diyizhangym);
        zhuye=findViewById(R.id.zhuye);
        xiazhang=findViewById(R.id.xiazhang);

        zhuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(diyizhangym.this,MainActivity.class);
            startActivity(intent);
            }
        });

        xiazhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(diyizhangym.this,jieshao.class);
                startActivity(intent);
            }
        });

    }
}