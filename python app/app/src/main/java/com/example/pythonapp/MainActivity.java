package com.example.pythonapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button diyizhang;
    public Button dierzhang;
    public Button disanzhang;
    public Button disizhang;
    public Button diwuzhang;
    public Button diliuzhang;
    public Button diqizhang;
    public Button qibazhang;
    public Button jieshao;
    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diyizhang = findViewById(R.id.diyizhang);
        dierzhang =findViewById(R.id.dierzhang);
        disanzhang =findViewById(R.id.disanzhang);
        disizhang =findViewById(R.id.disizhang);
        diwuzhang =findViewById(R.id.diwuzhang);
        diliuzhang =findViewById(R.id.diliuzhang);
        diqizhang =findViewById(R.id.diqizhang);
        qibazhang =findViewById(R.id.qibazhang);
        jieshao=findViewById(R.id.jieshao);
        diyizhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(MainActivity.this, diyizhangym.class));
            } });
        dierzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(MainActivity.this, dierzhangym.class));
            } });
        disanzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(MainActivity.this, disanzhangym.class));
            } });
        disizhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(MainActivity.this, disizhangym.class));
            } });
        diwuzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(MainActivity.this, diwuzhangym.class));
            } });
        diliuzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(MainActivity.this, diliuzhangym.class));
            } });
        diqizhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(MainActivity.this,diqizhangym.class));
            }
        });
        qibazhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(MainActivity.this,qibazhangym.class));
            }
        });
        jieshao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startActivity(new Intent(MainActivity.this, jieshao.class));
            } });

    }
}