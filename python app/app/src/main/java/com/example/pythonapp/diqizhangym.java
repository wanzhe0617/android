package com.example.pythonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class diqizhangym extends AppCompatActivity {
    private RadioGroup xz1,xz2;
    private RadioButton xz1t1,xz1t2,xz1t3,xz1t4,xz2t1,xz2t2,xz2t3,xz2t4;
    private TextView xzttm1daan,xzttm2daan;
    private TextView shizuodaan;
    private Button qudedaan;
    private Button shangzhang,zhuye,xiazhang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diqizhangym);xz1 = findViewById(R.id.xz1);
        xz1t1 = findViewById(R.id.xz1t1);
        xz1t2 = findViewById(R.id.xz1t2);
        xz1t3 = findViewById(R.id.xz1t3);
        xz1t4 = findViewById(R.id.xz1t4);
        xzttm1daan =findViewById(R.id.xzttm1daan);
        xz1.setOnCheckedChangeListener(xz1Listener);

        xz2 = findViewById(R.id.xz2);
        xz2t1 = findViewById(R.id.xz2t1);
        xz2t2 = findViewById(R.id.xz2t2);
        xz2t3 = findViewById(R.id.xz2t3);
        xz2t4 = findViewById(R.id.xz2t4);
        xzttm2daan =findViewById(R.id.xzttm2daan);
        xz2.setOnCheckedChangeListener(xz2Listener);

        shizuodaan = findViewById(R.id.shizuodaan);
        qudedaan = findViewById(R.id.qudedaan);
        qudedaan.setOnClickListener(qudedaanListener);

        shangzhang=findViewById(R.id.shangzhang);
        zhuye=findViewById(R.id.zhuye);
        xiazhang=findViewById(R.id.xiazhang);

        shangzhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(diqizhangym.this,diliuzhangym.class);
                startActivity(intent);
            }
        });

        zhuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(diqizhangym.this,MainActivity.class);
                startActivity(intent);
            }
        });

        xiazhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(diqizhangym.this,qibazhangym.class);
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
                        xzttm1daan.setText("O:答對了");
                    else if (checkId == R.id.xz1t3)
                        xzttm1daan.setText("X:答錯了");
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
                    ;
                    if (checkId == R.id.xz2t1)
                        xzttm2daan.setText("X:答錯了");
                    else if (checkId == R.id.xz2t2)
                        xzttm2daan.setText("X:答錯了");
                    else if (checkId == R.id.xz2t3)
                        xzttm2daan.setText("X:答錯了");
                    else if (checkId == R.id.xz2t4)
                        xzttm2daan.setText("O:答對了");


                }
            };

    private Button.OnClickListener qudedaanListener =
            new Button.OnClickListener(){
                @Override
                public void onClick(View v){
                    String s=qudedaan.getText().toString();
                    Button btn=(Button)findViewById(v.getId());
                    shizuodaan.setText("def heat(protein,sugar,fat):\n" +
                            "    heat=protein * 4 + sugar * 4 + fat * 9\n\n" +
                            "    return heat\n" +
                            "protein = int(input(\"請問這個食物的蛋白質幾克：\"))\n" +
                            "sugar = int(input(\"請問這個食物的糖類幾克：\"))\n" +
                            "fat = int(input(\"請問這個食物的脂肪幾克：\"))\n" +
                            "print（\"這個食物總熱量\"，heat(protein,sugar,fat),\"大卡\"）");
                }


            };
}