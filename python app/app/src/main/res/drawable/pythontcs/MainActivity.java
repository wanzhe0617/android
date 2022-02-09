package com.example.pythontcs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public ImageView diyizhang;
    public ImageView dierzhang;
    public ImageView disanzhang;
    public ImageView disizhang;
    public ImageView diwuzhang;
    public ImageView diliuzhang;
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
    }
}