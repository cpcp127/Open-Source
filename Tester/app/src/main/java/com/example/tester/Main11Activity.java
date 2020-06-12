package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main11Activity extends AppCompatActivity {
    String str11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Button button28=(Button)findViewById(R.id.button28);
        Button button29=(Button)findViewById(R.id.button29);
        Button button31=(Button)findViewById(R.id.button31);
        Button button33=(Button)findViewById(R.id.button33);
        Button button34=(Button)findViewById(R.id.button34);




    }
    public void onButtonClicked8(View view){
        if(view.getId()==R.id.button28){
            str11="감기";
            Intent intent = new Intent(Main11Activity.this, Main9Activity.class);
            intent.putExtra("cold", str11);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button29){
            str11="결핵";
            Intent intent = new Intent(Main11Activity.this, Main9Activity.class);
            intent.putExtra("cold", str11);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button31){
            str11="폐렴";
            Intent intent = new Intent(Main11Activity.this, Main9Activity.class);
            intent.putExtra("cold", str11);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button33){
            str11="독감";
            Intent intent = new Intent(Main11Activity.this, Main9Activity.class);
            intent.putExtra("cold", str11);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button34){
            str11="비염";
            Intent intent = new Intent(Main11Activity.this, Main9Activity.class);
            intent.putExtra("cold", str11);
            startActivity(intent);
        }
    }

}
