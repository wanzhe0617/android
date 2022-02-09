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

public class disanzhangym extends AppCompatActivity {private TextView xzttm1daan;
    private RadioButton xz1t1,xz1t2,xz1t3,xz1t4;
    private RadioGroup xz1;
    private TextView xzttm2daan;
    private RadioButton xz2t1,xz2t2,xz2t3,xz2t4;
    private  RadioGroup xz2;
    private TextView shizuodaan;
    private Button qudedaan;
    private Button shangzhang,zhuye,xiazhang;
    private Button csm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disanzhangym);
        xzttm1daan = findViewById(R.id.xzttm1daan);
        xz1 = findViewById(R.id.xz1);
        xz1t1 = findViewById(R.id.xz1t1);
        xz1t2 = findViewById(R.id.xz1t2);
        xz1t3 = findViewById(R.id.xz1t3);
        xz1t4 = findViewById(R.id.xz1t4);
        xz1.setOnCheckedChangeListener(xz1Listener);

        xzttm2daan = findViewById(R.id.xzttm2daan);
        xz2 = findViewById(R.id.xz2);
        xz2t1 = findViewById(R.id.xz2t1);
        xz2t2 = findViewById(R.id.xz2t2);
        xz2t3 = findViewById(R.id.xz2t3);
        xz2t4 = findViewById(R.id.xz2t4);
        xz2.setOnCheckedChangeListener(xz2Listener);

        qudedaan = findViewById(R.id.qudedaan);
        shizuodaan = findViewById(R.id.shizuodaan);
        qudedaan.setOnClickListener(qudedaanListener);

        shangzhang=findViewById(R.id.shangzhang);
        zhuye=findViewById(R.id.zhuye);
        xiazhang=findViewById(R.id.xiazhang);

        csm=findViewById(R.id.csm);

        csm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://docs.google.com/document/d/1lZYIOcgRM81aH_6mmOqgkk7dasjN9uvpVTJQUiwEQKE/edit?usp=sharing");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        shangzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(disanzhangym.this,dierzhangym.class);
                startActivity(intent);
            }
        });

        zhuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(disanzhangym.this,MainActivity.class);
                startActivity(intent);
            }
        });

        xiazhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(disanzhangym.this,disizhangym.class);
                startActivity(intent);
            }
        });
    }

    private RadioGroup.OnCheckedChangeListener xz1Listener=
            new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                    int p =radioGroup.indexOfChild((RadioButton)
                            findViewById(checkId));
                    int count = radioGroup.getChildCount();

                    if (checkId == R.id.xz1t1)
                        xzttm1daan.setText("X:答錯了");
                    else if (checkId == R.id.xz1t2)
                        xzttm1daan.setText("X:答錯了");
                    else if (checkId == R.id.xz1t3)
                        xzttm1daan.setText("O:答對了");
                    else if (checkId == R.id.xz1t4)
                        xzttm1daan.setText("X:答錯了");


                }
            };

    private RadioGroup.OnCheckedChangeListener xz2Listener=
            new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                    int p =radioGroup.indexOfChild((RadioButton)
                            findViewById(checkId));
                    int count = radioGroup.getChildCount();

                    if (checkId == R.id.xz2t1)
                        xzttm2daan.setText("X:答錯了");
                    else if (checkId == R.id.xz2t2)
                        xzttm2daan.setText("O:答對了");
                    else if (checkId == R.id.xz2t3)
                        xzttm2daan.setText("X:答錯了");
                    else if (checkId == R.id.xz2t4)
                        xzttm2daan.setText("X:答錯了");


                }
            };

    private Button.OnClickListener qudedaanListener=
            new Button.OnClickListener() {
                @Override
                public void onClick(View v){
                    String s=qudedaan.getText().toString();
                    Button btn=(Button)findViewById(v.getId());
                    shizuodaan.setText("for i in range(1,10):"+
                            "\nfor j in range(1,10):"+
                            "\nprint(str(i) + 'x' + str(j) + '=' + str(i*j), end=' ')"+
                            "\nprint() # newline");
                }
            };
}