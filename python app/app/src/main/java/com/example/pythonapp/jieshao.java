package com.example.pythonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jieshao extends AppCompatActivity {
    private Button shangzhang,zhuye,xiazhang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jieshao);
        shangzhang = findViewById(R.id.shangzhang);
        zhuye = findViewById(R.id.zhuye);
        xiazhang=findViewById(R.id.xiazhang);

        shangzhang.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(jieshao.this,diyizhangym.class);
                startActivity(intent);
            }
        });

        zhuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(jieshao.this,MainActivity.class);
                startActivity(intent);
            }
        });

        xiazhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(jieshao.this,dierzhangym.class);
                startActivity(intent);
            }
        });
    }
}