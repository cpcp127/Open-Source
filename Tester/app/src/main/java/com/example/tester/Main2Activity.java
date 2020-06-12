package com.example.tester;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends MainActivity {
    String name,name1,name2,name3,name4,name5;
    Button button5,button6,button80,button82;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView8=findViewById(R.id.textView8);
        TextView textView7=findViewById(R.id.textView7);
        TextView textView20=findViewById(R.id.textView20);
        TextView textView3=findViewById(R.id.textView3);
        TextView textView6=findViewById(R.id.textView6);
        TextView textView9=findViewById(R.id.textView9);
        TextView textView10=findViewById(R.id.textView10);
        TextView textView17=findViewById(R.id.textView17);
        TextView textView18=findViewById(R.id.textView18);
        TextView textView19=findViewById(R.id.textView19);
        TextView textView21=findViewById(R.id.textView21);
        TextView textView22=findViewById(R.id.textView22);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button80=(Button)findViewById(R.id.button80);
        button82=(Button)findViewById(R.id.button82);


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps/search/이비인후과"));
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps/search/약국"));
                startActivity(intent);
            }
        });
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main11Activity.class);
                startActivity(intent);
            }
        });
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main12Activity.class);
                startActivity(intent);
            }
        });


        Intent intent=getIntent();
        name=intent.getExtras().getString("itpang1");
        textView8.setText(name);//체온
        switch(name){
            case "미열":
                int orange = Color.rgb(255, 165, 0);
                textView8.setTextColor(orange);
                textView10.setText(Html.fromHtml("미열일때"+"<font color=\"#dc134c\"><u>감기</u></font>" + "와 "+"<font color=\"#dc134c\"><u>결핵</u></font>" +"이 의심됩니다"));
                break;
            case "정상":
                textView8.setTextColor(Color.BLUE);
                textView10.setText(Html.fromHtml("정상일때 콧물이 심하면 "+" <font color=\"#dc134c\"><u>비염</u></font>" +"이 의심됩니다"));

                break;
            case "고열":
                textView8.setTextColor(Color.RED);
                textView10.setText(Html.fromHtml("고열일때 "+"<font color=\"#dc134c\"><u>독감</u></font>" + "이나"+"<font color=\"#dc134c\"><u>폐렴</u></font>" +"이 의심됩니다"));
                break;
        }
        name1=intent.getExtras().getString("itpang2");
        textView7.setText(name1);//콧물
        switch(name1) {
            case "없음":
                textView7.setTextColor(Color.BLUE);
                textView17.setText(Html.fromHtml("콧물이 없을때 고열이면 "+"<font color=\"#dc134c\"><u>폐렴</u></font>" + "이 의심되고 미열이면 "+"<font color=\"#dc134c\"><u>결핵</u></font>" +"이 의심됩니다"));
                break;
            case "투명한색":
                int orange = Color.rgb(255, 165, 0);
                textView7.setTextColor(orange);

                textView17.setText(Html.fromHtml("콧물이 투명할때는 "+"<font color=\"#dc134c\"><u>비염</u></font>"+"이 의심됩니다"));
                break;
            case "노르스름한색":
                textView7.setTextColor(Color.RED);
                textView17.setText(Html.fromHtml("콧물이 노르스름한 색일때 "+"<font color=\"#dc134c\"><u>감기</u></font>" + "나 "+"<font color=\"#dc134c\"><u>독감</u></font>" +"이 의심됩니다"));
                break;
        }
        name2=intent.getExtras().getString("itpang3");
        textView20.setText(name2);//가래
        switch(name2) {
            case "없음":
                textView20.setTextColor(Color.BLUE);
                textView18.setText(Html.fromHtml("고열이고 가래가 없으면 "+"<font color=\"#dc134c\"><u>독감</u></font>"+"이 의심됩니다"));
                break;
            case "투명한 가래":
                int orange = Color.rgb(255, 165, 0);
                textView20.setTextColor(orange);
                textView18.setText(Html.fromHtml("투명한 가래일때 "+"<font color=\"#dc134c\"><u>감기</u></font>"+"가 의심됩니다"));
                break;
            case "피가 섞인 가래":
                textView20.setTextColor(Color.RED);
                textView18.setText(Html.fromHtml("피가 섞인 가래는 "+"<font color=\"#dc134c\"><u>페렴</u></font>" + "이나 "+"<font color=\"#dc134c\"><u>결핵</u></font>" +"의 특징입니다"));

                break;
        }
        name3=intent.getExtras().getString("itpang4");
        textView3.setText(name3);//기침
        switch(name3) {
            case "약한 기침":
                int orange = Color.rgb(255, 165, 0);
                textView3.setTextColor(orange);
                textView19.setText(Html.fromHtml("약한 기침은 "+"<font color=\"#dc134c\"><u>감기</u></font>" + "가 의심되고 2주 가량 지속되면"+"<font color=\"#dc134c\"><u>결핵</u></font>" +"이 의심됩니다"));
                break;
            case "심한 기침":
                textView3.setTextColor(Color.RED);
                textView19.setText(Html.fromHtml("심한 기침은 "+"<font color=\"#dc134c\"><u>독감</u></font>" + "이나 "+"<font color=\"#dc134c\"><u>폐렴</u></font>" +"이 의심됩니다"));
                break;
                case "연발적,발작적":
                textView3.setTextColor(Color.BLUE);
                textView19.setText(Html.fromHtml("연발적,발작적 기침은 "+"<font color=\"#dc134c\"><u>알레르기비염</u></font>" + "의 특징입니다"));
                break;
        }
        name4=intent.getExtras().getString("itpang5");
        textView6.setText(name4);//두통,근육통
        switch(name4) {
            case "약하거나 없음":
                textView6.setTextColor(Color.BLUE);
                textView21.setText(Html.fromHtml(""+"<font color=\"#dc134c\"><u>감기</u></font>" + "의 경우 두통이나 근육통이 약합니다"));
                break;
            case "몸살 증상":
                int orange = Color.rgb(255, 165, 0);
                textView6.setTextColor(orange);
                textView21.setText(Html.fromHtml(""+"<font color=\"#dc134c\"><u>독감</u></font>" + "의 경우 몸살 증상이 특징입니다"));
                break;
            case "가슴 고통":
                textView6.setTextColor(Color.RED);
                textView21.setText(Html.fromHtml(""+"<font color=\"#dc134c\"><u>폐렴</u></font>" + "과 "+"<font color=\"#dc134c\"><u>결핵</u></font>"+"일때 가슴통증이 있고 기침을 할때 가슴통증이 심한것은 "+"<font color=\"#dc134c\"><u>폐렴</u></font>"+"의 특징입니다"));
                break;
        }
        name5=intent.getExtras().getString("itpang6");
        textView9.setText(name5);//피로감
        switch(name5) {
            case "약하거나 없음":
                textView9.setTextColor(Color.BLUE);
                textView22.setText(Html.fromHtml(""+"<font color=\"#dc134c\"><u>감기</u></font>" + "의 피로감이 적습니다"));
                break;
            case "지속적인 피로감":
                int orange = Color.rgb(255, 165, 0);
                textView9.setTextColor(orange);
                textView22.setText("피로감이 2주정도 지속되면 독감이 의심됩니다");
                textView22.setText(Html.fromHtml("피로감이 2주정도 지속되면 "+"<font color=\"#dc134c\"><u>독감</u></font>" + "이 의심됩니다"));
                break;
            case "쉽게 피로를 느낌":
                textView9.setTextColor(Color.RED);
                textView22.setText("쉽게 피로를 느끼면 결핵이 의심됩니다");
                textView19.setText(Html.fromHtml("쉽게 피로를 느끼면 "+"<font color=\"#dc134c\"><u>결핵</u></font>" + "이 의심됩니다"));
                break;
        }


    }





}
