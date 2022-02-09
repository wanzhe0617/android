package com.example.pythonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qibazhangym extends AppCompatActivity {
    private Button csm;
    private Button shangzhang,zhuye,xiazhang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qibazhangym);
        csm = findViewById(R.id.csm);
        shangzhang = findViewById(R.id.shangzhang);
        zhuye = findViewById(R.id.zhuye);
        xiazhang = findViewById(R.id.xiazhang);

        csm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/drive/folders/1cXO5HqYTeEc9Wd3zl291kabse89yvoqF?usp=sharing");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        shangzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(qibazhangym.this, disizhangym.class);
                startActivity(intent);
            }
        });

        zhuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(qibazhangym.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}