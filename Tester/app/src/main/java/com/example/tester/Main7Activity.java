package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main7Activity extends AppCompatActivity {

    String str12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Button button3=(Button)findViewById(R.id.button23);
        Button button8=(Button)findViewById(R.id.button24);
        Button button10=(Button)findViewById(R.id.button25);
        Button button11=(Button)findViewById(R.id.button26);
        Button button12=(Button)findViewById(R.id.button22);

    }
    public void onButtonClicked9(View view){
        if(view.getId()==R.id.button22){
            str12="수두";
            Intent intent = new Intent(Main7Activity.this, Main10Activity.class);
            intent.putExtra("colds", str12);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button23){
            str12="폐렴구균";
            Intent intent = new Intent(Main7Activity.this, Main10Activity.class);
            intent.putExtra("colds", str12);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button24){
            str12="B형간염";
            Intent intent = new Intent(Main7Activity.this, Main10Activity.class);
            intent.putExtra("colds", str12);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button25){
            str12="대상포진";
            Intent intent = new Intent(Main7Activity.this, Main10Activity.class);
            intent.putExtra("colds", str12);
            startActivity(intent);
        }
        else if(view.getId()==R.id.button26){
            str12="A형간염";
            Intent intent = new Intent(Main7Activity.this, Main10Activity.class);
            intent.putExtra("colds", str12);
            startActivity(intent);
        }

    }
}
