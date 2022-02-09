package com.example.pythonapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class diliuzhangym extends AppCompatActivity {

    private Button shangzhang,zhuye,xiazhang,csm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diliuzhangym);

        shangzhang=findViewById(R.id.shangzhang);
        zhuye=findViewById(R.id.zhuye);
        xiazhang=findViewById(R.id.xiazhang);
        csm=findViewById(R.id.csm);

        csm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://docs.google.com/document/d/16UkOd_f6I6-Db9eVpKQ8n0f48R4ZaTshVl6SGHGyxPo/edit?usp=sharing");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        shangzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(diliuzhangym.this,diwuzhangym.class);
                startActivity(intent);
            }
        });

        zhuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(diliuzhangym.this,MainActivity.class);
                startActivity(intent);
            }
        });

        xiazhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(diliuzhangym.this,diqizhangym.class);
                startActivity(intent);
            }
        });
    }
}