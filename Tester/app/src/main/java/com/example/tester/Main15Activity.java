package com.example.tester;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main15Activity extends AppCompatActivity {
    private ListView listView;
    ArrayList<Food> h_info_list;
    FoodAdpter myadapter;
    Food myFood1,myFood2,myFood3,myFood4,myFood5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        TextView textView62=(TextView)findViewById(R.id.textView62);
        textView62.setText("폐렴에 좋은 음식");
        listView = (ListView)findViewById(R.id.listView);
        myFood1 = new Food("무", "무즙을 술잔으로 세 잔 정도와 무즙의 2/5정도의 생강즙에 섞어 뜨거울 물500mL 넣어서 자기 전에 마시고 몸을 따뜻하게 하고 잡니다. 효과가 적을 떄는 몇 번이고 반복하면 됩니다. 특히 편도선염에도 효과가 좋은 것으로 알려져 있습니다.", BitmapFactory.decodeResource(getResources(), R.drawable.mo));
        myFood2 = new Food("감", "잘 익은 감을 그대로 먹습니다. 곶감을 먹어도 좋은 효과를 볼 수 있습니다. 감은 몸을 식히고 폐를 보호해 줍니다. 곶감 표면의 흰가루에는 진해작용을 하는 성분이 들어 있습니다.", BitmapFactory.decodeResource(getResources(), R.drawable.gam));
        myFood3 = new Food("모과차", "모과는 만성화된 기침에 효과가 있다. 모과차를 꾸준히 마시면 기침감기에 좋다. 근육과 골격을 이루는 주요 성분인 칼슘과 미네랄, 철분 등을 풍부하게 함유하고 있어 근육의 피로를 풀어주고 관절을 강화시키는 효능도 있다.", BitmapFactory.decodeResource(getResources(), R.drawable.mogua));
        myFood4=new Food("배","한의학에서 배는 만성 기침과 가래 해소에 효과적이며 몸의 열을 내려주는 데 도움이 된다고 알려져 있다. 배에는 루테올린이라는 성분이 풍부하게 들어 있어 기관지염, 기침, 가래를 다스리는 데 효과적이다",BitmapFactory.decodeResource(getResources(), R.drawable.peer));
        myFood5=new Food("생강차","생강차는 몸을 따뜻하게 만들어줍니다. 생강의 쇼가올과 진저롤 성분이 몸의 찬 기운을 밖으로 내몰아 줍니다. 감기 몸살의 증상이 있고 기침이 실할 때는 생강 한개를 얇게 썰어 넣고 물을 부은 후 30~40분 달여 윗물만 따라 내고 꿀을 넣어 마셔보세요",BitmapFactory.decodeResource(getResources(), R.drawable.sang));
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
