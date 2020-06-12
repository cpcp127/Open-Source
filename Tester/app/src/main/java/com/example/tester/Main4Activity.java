package com.example.tester;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Main4Activity extends AppCompatActivity {
    Button button2;
    EditText editText2;
    String str8,str9;
    NumberPicker picker;
    TextView textView37;
    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        editText2=(EditText)findViewById(R.id.editText2);
        editText2.setHint("이름을 입력하세요");
        button2=(Button)findViewById(R.id.button2);
        picker=(NumberPicker)findViewById(R.id.picker);
        picker.setMinValue(1);
        picker.setMaxValue(99);
        picker.setValue(25);
        picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                x=picker.getValue();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }
    public void onRadioButtonClicked6(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton16:
                if (checked)
                    str8 = "남성";
                break;
            case R.id.radioButton20:
                if (checked)
                    str8 = "여성";
                break;

        }
    }


    void show(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("확인!");
        builder.setMessage("이름 : "+editText2.getText().toString()+"\n성별 : "+str8+"\n나이 : "+x);
        builder.setPositiveButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(getApplicationContext(),Main3Activity.class);
                intent.putExtra("age",x);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("아니요", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"아니요를 선택했습니다",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
