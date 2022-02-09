package com.example.pythontcs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class dierzhangym extends AppCompatActivity {
    private TextView xzttm1daan;
    private RadioButton xz1t1, xz1t2, xz1t3, xz1t4;
    private RadioGroup xz1;
    private TextView xzttm2daan;
    private RadioButton xz2t1, xz2t2, xz2t3, xz2t4;
    private RadioGroup xz2;
    private TextView shizuodaan;
    private Button qudedaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dierzhangym);
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

    }

    private RadioGroup.OnCheckedChangeListener xz1Listener =
            new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                    int p = radioGroup.indexOfChild((RadioButton)
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

    private RadioGroup.OnCheckedChangeListener xz2Listener =
            new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                    int p = radioGroup.indexOfChild((RadioButton)
                            findViewById(checkId));
                    int count = radioGroup.getChildCount();

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
            new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s = qudedaan.getText().toString();
                    Button btn = (Button) findViewById(v.getId());
                    shizuodaan.setText("#score = 79 #用score這個變數來儲存學生的學期成績" +
                            "\nif score>=90: print(“成績為A+，太厲害了”)" +
                            "\nelif score>=80: print(“成績為A，很優秀哦”)" +
                            "\n#第二個“if”所以用“elif”" +
                            "\nelif score>=70: print(“成績為B，還不錯哦”)" +
                            "\nelif score>=60: print(“成績為C，馬馬虎虎啦”)" +
                            "\nelif score>=50: print(“成績為C-，還有補考機會”)" +
                            "\nelse: print(“成績為F，再接再厲”)" +
                            "\n#因爲是最後一個所以用“else”);");
                }

            };
}