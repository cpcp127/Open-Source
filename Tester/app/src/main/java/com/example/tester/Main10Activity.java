package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main10Activity extends AppCompatActivity {
    String key2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        TextView textView42=(TextView)findViewById(R.id.textView42);//병명
        TextView textView43=(TextView)findViewById(R.id.textView43);//를 예방하는접종
        TextView textView48 = (TextView) findViewById(R.id.textView48);//설명
        TextView textView49 = (TextView) findViewById(R.id.textView49);//접종스케줄
        TextView textView51 = (TextView) findViewById(R.id.textView51);//접종시 이상반응
        TextView textView50=(TextView)findViewById(R.id.textView50);//접종대상
        TextView textView44=(TextView)findViewById(R.id.textView44);//
        TextView textView47=(TextView)findViewById(R.id.textView47);//이상반응
        TextView textView45=(TextView)findViewById(R.id.textView45);
        Intent intent = getIntent();
        key2=intent.getExtras().getString("colds");
        switch (key2){
            case"A형간염":
                textView42.setText("A형간염");
                textView43.setText("A형간염을 예방하는 접종입니다");
                textView48.setText("A형간염은 음식이나 물을 통해 전염돼, 개인위생 관리가 좋지 않은 저개발 국가에 많은 것으로 여겨졌으나 올해 들어 20~40대와 수두권을 중심으로 빠륵 전파돼 감염자수가 1민명을 넘었습니다");
                textView50.setText("만 20~39세의 성인 과거 A형 간염에 걸린 적이 없어서 항체가 형성되지 않았다면 A형 간염 예방접종을 해야합니다");
                textView49.setText("1차 접종 후 6~18개월 뒤에 2차 접동을하는데 2차 접종 시기는 백신의 종류에 따라 다릅니다");
                textView47.setVisibility(View.GONE);
                textView51.setVisibility(View.GONE);
                break;
            case"수두":
                textView42.setText("수두");
                textView43.setText("수두를 예방하는 접종입니다");
                textView48.setText("성인이 수두에 걸리면 어린이보다 증상이 더 심하며, 합병증의 발병 위험도 높은데, 특히 성인 수두 환자의 20%는 합병증으로 폐렴이 나타나는 것으로 알려져 있습니다");
                textView50.setText("1971년 이후 출생자 중에 과거 수두를 앓은 적이 없거나 항체가 형성되지 않았다면 예방접종을 합니다."+"\n특히 임산부가 수두에 감염되면 신생아가 감염될 우려가 있으므로 가임기 여성은 항체 형성 여부를 반드시 확인해야 합니다");
                textView49.setText("2회 접종하는데, 1차 접종 후 4~8주 후에 2차 접종합니다.");
                textView47.setVisibility(View.INVISIBLE);
                textView51.setVisibility(View.GONE);
                break;
            case"폐렴구균":
                textView42.setText("폐렴구균");
                textView43.setText("폐렴구균을 예방하는 접종입니다");
                textView48.setText("건강한 고령 어르신이라도 감기에 걸렸다가 폐렴으로 악화되는 것은 흔한 일입니다"+"\n폐렴은 건강한 성인이라면 그다지 위험한 질병은 아니지만 고령 어르신은 매우 위험할 수 있습니다"+"\n때문에 65세 이상이라면 반드시 폐렴 예방접종을 해야 하며, 보건소에서 무료로 접종할 수 있고 한 번만 접종하면 됩니다");
                textView50.setText("65세 이상은 무료로 접종");
                textView49.setVisibility(View.GONE);
                textView45.setVisibility(View.GONE);
                textView47.setVisibility(View.GONE);
                textView51.setVisibility(View.GONE);
                break;
            case"B형간염":
                textView42.setText("B형간염");
                textView43.setText("B형간염을 예방하는 접종입니다");
                textView48.setText("B형 간염은 바이러스에 의해 전파되는데, 걸리더라도 대부분 특별한 치료 없이도 저절로 회복되지만 일부에서는 만성 간염으로 진행되기도 하므로 예방접종이 필요합니다");
                textView50.setText("과거 B형 간염에 걸린 적이 없어서 항체가 형성되지 않았다면 B형 간염 예방접종을 합니다.");
                textView49.setText("3회 접종하는데, 1차 접종 후1개월과 6개월 간격으로 접종합니다.");
                textView47.setVisibility(View.INVISIBLE);
                textView51.setVisibility(View.GONE);
                break;
            case"대상포진":
                textView42.setText("대상포진");
                textView43.setText("대상포진을 예방하는 접종입니다");
                textView48.setText("대상포진은 50대 이후 중장년층에 많이 발생하며, 통증이 극심해'통증의 왕'이라고 불립니다" +
                        "\n이전에 수두에 걸린적이 없다면 예방접종을 하지 않아도 되는 것으로 생각하기 쉬운데, 수두 바이러스에 감염돼도 별다른 증상 없이 지나가는 경우도 많으므로 50대 이상 장년층은 대상포진 예방접종을 하는 것이 좋습니다");
                textView50.setText("50대 이후 필요");
                textView49.setText("예방접종은 1회 주사만으로 완료됩니다"+"\n예방접종 성공률은 50%를 넘으며, 설사 대상포진에 걸린다 하더라도 '포진 후 신경통'의 발병률을 60%이상 감소시키는 효과가 있습니다.");
                textView47.setVisibility(View.INVISIBLE);
                textView51.setVisibility(View.GONE);
                break;
        }

    }
}
