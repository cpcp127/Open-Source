package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Button button28=(Button)findViewById(R.id.button28);
        Button button29=(Button)findViewById(R.id.button29);
        Button button31=(Button)findViewById(R.id.button31);
        Button button33=(Button)findViewById(R.id.button33);
        Button button34=(Button)findViewById(R.id.button34);

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main12Activity.this,Main13Activity.class);
                startActivity(intent);
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main12Activity.this,Main14Activity.class);
                startActivity(intent);
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main12Activity.this,Main15Activity.class);
                startActivity(intent);

            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main12Activity.this,Main16Activity.class);
                startActivity(intent);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main12Activity.this,Main17Activity.class);
                startActivity(intent);
            }
        });
    }
}
