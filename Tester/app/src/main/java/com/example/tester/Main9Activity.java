package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main9Activity extends AppCompatActivity {
    String key2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Button button28=(Button)findViewById(R.id.button28);
        Button button29=(Button)findViewById(R.id.button29);
        Button button31=(Button)findViewById(R.id.button31);
        Button button33=(Button)findViewById(R.id.button33);
        Button button34=(Button)findViewById(R.id.button34);
        TextView textView54=(TextView)findViewById(R.id.textView54);
        TextView textView55=(TextView)findViewById(R.id.textView55);
        TextView textView56=(TextView)findViewById(R.id.textView56);
        TextView textView59=(TextView)findViewById(R.id.textView59);
        TextView textView60=(TextView)findViewById(R.id.textView60);


        Intent intent=getIntent();
        key2=intent.getExtras().getString("cold");
        switch (key2)
        {
            case "결핵":
                button28.setBackgroundResource(R.drawable.stethoscope);
                textView54.setText("아플 땐 검진");
                button29.setBackgroundResource(R.drawable.stst);
                textView55.setText("예방 접종");
                button31.setBackgroundResource(R.drawable.sneeze);
                textView56.setText("기침 예절");
                button33.setBackgroundResource(R.drawable.windows);
                textView59.setText("잦은 환기");
                textView60.setText("균형있는 영양 섭취");
                break;
            case"폐렴":
                button28.setBackgroundResource(R.drawable.washing);
                textView54.setText("손 씻기");
                button29.setBackgroundResource(R.drawable.windows);
                textView55.setText("잦은 환기");
                button31.setBackgroundResource(R.drawable.humidity);
                textView56.setText("습도 유지");
                button33.setBackgroundResource(R.drawable.water);
                textView59.setText("수분 보충");
                button34.setBackgroundResource(R.drawable.stst);
                textView60.setText("예방 접종");
                break;
            case"독감":
                button28.setBackgroundResource(R.drawable.stst);
                textView54.setText("예방 접종");
                break;
            case"비염":
                button28.setBackgroundResource(R.drawable.washing);
                textView54.setText("손 씻기");
                button29.setBackgroundResource(R.drawable.windows);
                textView55.setText("잦은 환기");
                button31.setBackgroundResource(R.drawable.humidity);
                textView56.setText("습도 유지");
                button33.setBackgroundResource(R.drawable.mask);
                textView59.setText("마스크 착용");
                button34.setBackgroundResource(R.drawable.icecream);
                textView60.setText("찬 음식 피하기");
                break;

        }
    }

}
