package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Main3Activity {
    String str, str1, str2, str3, str4, str5;
    public int TERMS_AGREE_1=0;
    public int TERMS_AGREE_2=0;
    public int TERMS_AGREE_3=0;
    String data;
    TextView textView2;
    ProgressBar progressBar;
    RadioGroup radioGroup1 ;
    RadioGroup radioGroup2 ;
    RadioGroup radioGroup3 ;
    RadioGroup radioGroup4 ;
    RadioGroup radioGroup5 ;
    RadioGroup radioGroup6 ;
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;
    RadioButton radioButton10;
    RadioButton radioButton11;
    RadioButton radioButton12;
    RadioButton radioButton13;
    RadioButton radioButton14;
    RadioButton radioButton15;
    RadioButton radioButton17;
    RadioButton radioButton18;
    RadioButton radioButton19;
    RadioButton radioButton25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        radioButton3=(RadioButton)findViewById(R.id.radioButton3);
        radioButton4=(RadioButton)findViewById(R.id.radioButton4);
        radioButton5=(RadioButton)findViewById(R.id.radioButton5);
        radioButton6=(RadioButton)findViewById(R.id.radioButton6);
        radioButton7=(RadioButton)findViewById(R.id.radioButton7);
        radioButton8=(RadioButton)findViewById(R.id.radioButton8);
        radioButton9=(RadioButton)findViewById(R.id.radioButton9);
        radioButton10=(RadioButton)findViewById(R.id.radioButton10);
        radioButton11=(RadioButton)findViewById(R.id.radioButton11);
        radioButton12=(RadioButton)findViewById(R.id.radioButton12);
        radioButton13=(RadioButton)findViewById(R.id.radioButton13);
        radioButton14=(RadioButton)findViewById(R.id.radioButton14);
        radioButton15=(RadioButton)findViewById(R.id.radioButton15);
        radioButton17=(RadioButton)findViewById(R.id.radioButton17);
        radioButton18=(RadioButton)findViewById(R.id.radioButton18);
        radioButton19=(RadioButton)findViewById(R.id.radioButton19);



        Button btnNext = (Button) findViewById(R.id.btnNext);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);




        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("itpang1", str);//체온
                    intent.putExtra("itpang2", str1);//콧물
                    intent.putExtra("itpang3", str2);//기침
                    intent.putExtra("itpang4", str3);
                    intent.putExtra("itpang5", str4);
                    intent.putExtra("itpang6", str5);
                    startActivity(intent);
            }
        });

        Intent intent = getIntent();
        data = intent.getStringExtra("INPUT_TEXT");
        textView2 = findViewById(R.id.textView2);
        textView2.setText("체온 : " + data + "C");


    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    str = "미열";

                break;
            case R.id.radioButton2:
                if (checked)
                    str = "정상";

                break;
            case R.id.radioButton3:
                if (checked)
                    str = "고열";
                break;


        }

    }

    public void onRadioButtonClicked1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton7:
                if (checked)
                    str1 = "없음";
                break;
            case R.id.radioButton8:
                if (checked)
                    str1 = "투명한색";
                break;
            case R.id.radioButton9:
                if (checked)
                    str1 = "노르스름한색";
                break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton4:
                if (checked)
                    str2 = "없음";
                break;
            case R.id.radioButton5:
                if (checked)
                    str2 = "투명한 가래";
                break;
            case R.id.radioButton6:
                if (checked)
                    str2 = "피가 섞인 가래";
                break;
        }
    }

    public void onRadioButtonClicked3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton10:
                if (checked)
                    str3 = "약한 기침";
                break;
            case R.id.radioButton11:
                if (checked)
                    str3 = "심한 기침";
                break;
            case R.id.radioButton12:
                if (checked)
                    str3 = "연발적,발작적";
                break;
        }
    }

    public void onRadioButtonClicked4(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton13:
                if (checked)
                    str4 = "약하거나 없음";
                break;
            case R.id.radioButton14:
                if (checked)
                    str4 = "몸살 증상";
                break;
            case R.id.radioButton15:
                if (checked)
                    str4 = "가슴 고통";
                break;
        }
    }

    public void onRadioButtonClicked5(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton17:
                if (checked)
                    str5 = "약하거나 없음";
                break;
            case R.id.radioButton18:
                if (checked)
                    str5 = "지속적인 피로감";
                break;
            case R.id.radioButton19:
                if (checked)
                    str5 = "쉽게 피로를 느낌";
                break;
        }
    }

}
