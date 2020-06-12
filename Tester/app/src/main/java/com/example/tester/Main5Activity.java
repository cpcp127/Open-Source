package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Main5Activity extends AppCompatActivity {
    String str10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button button3=(Button)findViewById(R.id.button3);
        Button button8=(Button)findViewById(R.id.button8);
        Button button10=(Button)findViewById(R.id.button10);
        Button button11=(Button)findViewById(R.id.button11);
        Button button12=(Button)findViewById(R.id.button12);
        Button button13=(Button)findViewById(R.id.button13);
        Button button14=(Button)findViewById(R.id.button14);
        Button button15=(Button)findViewById(R.id.button15);
        Button button16=(Button)findViewById(R.id.button16);
        Button button17=(Button)findViewById(R.id.button17);
        Button button18=(Button)findViewById(R.id.button18);
        Button button19=(Button)findViewById(R.id.button19);




        Button button20=(Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertadd=new AlertDialog.Builder(Main5Activity.this);
                LayoutInflater factory=LayoutInflater.from(Main5Activity.this);
                final View view=factory.inflate(R.layout.custom_dialog,null);
                alertadd.setView(view);
                alertadd.show();

            }
        });


    }
    public void onButtonClicked7(View view) {
        if (view.getId() == R.id.button3) {
            str10 = "결핵";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        } else if (view.getId() == R.id.button8) {
            str10 = "B형간염";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        } else if (view.getId() == R.id.button10) {
            str10 = "뇌수막염";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button11) {
            str10 = "소아마비";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button12) {
            str10 = "폐렴구균";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button13) {
            str10 = "DPT";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button14) {
            str10 = "수두";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button15) {
            str10 = "MMR";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button16) {
            str10 = "일본뇌염";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button17) {
            str10 = "인플루엔자";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button18) {
            str10 = "장티푸스";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
        else if (view.getId() == R.id.button19) {
            str10 = "콤보백신";
            Intent intent = new Intent(Main5Activity.this, Main8Activity.class);
            intent.putExtra("geul", str10);
            startActivity(intent);
        }
    }
}
