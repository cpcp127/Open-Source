package com.example.tester;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main14Activity extends AppCompatActivity {
    private ListView listView;
    ArrayList<Food> h_info_list;
    FoodAdpter myadapter;
    Food myFood1,myFood2,myFood3,myFood4,myFood5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        TextView textView62=(TextView)findViewById(R.id.textView62);
        textView62.setText("결핵에 좋은 음식");
        listView = (ListView)findViewById(R.id.listView);
        myFood1 = new Food("생강", "폐결핵에 좋은 음식으로는 생강이 있는데요 생강은 니코틴 해독에 효능이 있고 가래를 삭혀주며 면역력을 높여주는 음식이라고 해요. 또한 생강은 염증을 완화시켜주고 폐 세포의 재생을 촉진시켜주는데 도움을 준다고 합니다.", BitmapFactory.decodeResource(getResources(), R.drawable.sang));
        myFood2 = new Food("다시마", "철분이 많은 다시마는 피를 맑게 해주고 혈관에도 좋을 뿐만 아니라 면역력을 상승시켜 폐결핵을 완화하고 개선하는데 좋고 몸을 더 튼튼하게 만들어 준다고 합니다 생긴 멍울을 제거해주고 담도 풀어주는 다시마 효능이 있기 때문에 꾸준히 드시는 게\n" +
                "좋다고 합니다.", BitmapFactory.decodeResource(getResources(), R.drawable.dasima));
        myFood3 = new Food("연근", "비타민C와 철분이 풍부한 연근은 혈액생성에 도움을 주고 빈혈 예방에도 효과적이지만 뮤신이라는 찐득한 점액이 강장 작용을 해줘 쇠해진 기력을 회복시키는데 도움을 주기때문에 폐결핵에 좋은 음식이라고 합니다", BitmapFactory.decodeResource(getResources(), R.drawable.eun));
        myFood4=new Food("마늘","마늘도 결핵에 좋은 음식이라고 하는데요 알리신이라는 성분이 항균력이 강해서 결핵균을 살균해 준다고 합니다 하지만 드시는 약물에 따라 약효를 떨어뜨릴 수 있기 때문에 과다하게 섭취하면 좋지 않다고 합니다",BitmapFactory.decodeResource(getResources(), R.drawable.garic));
        myFood5=new Food("당근","시력에 좋은 당근은 기관지 점막을 튼튼하게 해주는 기능이 있는데요 폐결핵과 호흡기질환 중에 하나이기 때문에 호흡기를 튼튼하게 해주기 때문에 폐결핵에 좋은 음식이라고 합니다",BitmapFactory.decodeResource(getResources(), R.drawable.carrot));
        h_info_list = new ArrayList<Food>();
        h_info_list.add(myFood1);
        h_info_list.add(myFood2);
        h_info_list.add(myFood3);
        h_info_list.add(myFood4);
        h_info_list.add(myFood5);
        myadapter = new FoodAdpter(getApplicationContext(),R.layout.customlayout, h_info_list);
        listView.setAdapter(myadapter);

    }
}
