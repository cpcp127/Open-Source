package com.example.tester;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main17Activity extends AppCompatActivity {
    private ListView listView;
    ArrayList<Food> h_info_list;
    FoodAdpter myadapter;
    Food myFood1,myFood2,myFood3,myFood4,myFood5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        listView = (ListView)findViewById(R.id.listView);
        TextView textView62=(TextView)findViewById(R.id.textView62);
        textView62.setText("비염에 좋은 음식");
        myFood1 = new Food("감자", "비타민 B, C가 풍부해 면역력 향상에 좋고 알레르기 체질 개선과 증상 완화에 도움이 된다.", BitmapFactory.decodeResource(getResources(), R.drawable.potato));
        myFood2 = new Food("미나리", "식욕 증진, 해독작용이 뛰어나 알레르기 비염이 발생했을 때 곧바로 도움이 된다. 특히 뿌리를 자른 미나리를 깨끗이 씻어 물기를 완전히 제거하고, 즙을 내 냉장고에 넣어두었다가 마시거나 거즈에 묻혀 콧속을 냉찜질하면 좋다.", BitmapFactory.decodeResource(getResources(), R.drawable.minari));
        myFood3 = new Food("된장", "항암효과, 면역력 향상, 해독작용이 가능하다. 몸속에 쌓인 독소를 없애주기 때문에 알레르기 비염에도 좋다.", BitmapFactory.decodeResource(getResources(), R.drawable.dindin));
        myFood4=new Food("배","한의학에서 배는 만성 기침과 가래 해소에 효과적이며 몸의 열을 내려주는 데 도움이 된다고 알려져 있다. 배에는 루테올린이라는 성분이 풍부하게 들어 있어 기관지염, 기침, 가래를 다스리는 데 효과적이다",BitmapFactory.decodeResource(getResources(), R.drawable.peer));
        myFood5=new Food("검은콩","비타민B, 필수 아미노산, 아놀레산 등이 풍부하다. 혈관을 튼튼하게 하고 기침 가래를 삭이는데 도움을 주며, 면역 기능 강화에 효과적이다.",BitmapFactory.decodeResource(getResources(), R.drawable.bean));
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
