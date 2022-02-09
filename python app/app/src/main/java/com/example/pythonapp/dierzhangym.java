package com.example.pythonapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class dierzhangym extends AppCompatActivity {
    private Button csm;
    private Button shangzhang,zhuye,xiazhang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dierzhangym);
        shangzhang = findViewById(R.id.shangzhang);
        zhuye = findViewById(R.id.zhuye);
        xiazhang=findViewById(R.id.xiazhang);
        csm=findViewById(R.id.csm);

        csm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://docs.google.com/document/d/15xfYJH8umdFyDBEUTWJtyUn_yWpyavhNljFEO1yE5ts/edit?usp=sharing");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        shangzhang.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(dierzhangym.this,jieshao.class);
                startActivity(intent);
            }
        });

        zhuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(dierzhangym.this,MainActivity.class);
                startActivity(intent);
            }
        });

        xiazhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(dierzhangym.this,disanzhangym.class);
                startActivity(intent);
            }
        });

    }

}