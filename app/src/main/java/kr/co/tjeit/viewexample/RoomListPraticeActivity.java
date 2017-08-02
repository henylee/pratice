package kr.co.tjeit.viewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.viewexample.adapters.RoomAdapter;
import kr.co.tjeit.viewexample.data.RoomData;

public class RoomListPraticeActivity extends AppCompatActivity {

    private ListView roomListView;
    List<RoomData> roomDataList = new ArrayList<>();

    RoomAdapter roomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list_pratice);

        this.roomListView = (ListView) findViewById(R.id.roomListView);
        roomDataList.add(new RoomData("일반 원룸입니다.", 1000, 40, true, "원룸", 3, 33, 30000));
        roomDataList.add(new RoomData("일반 투룸입니다.", 2000, 50, false, "투룸", -2, 45, 40000));
        roomDataList.add(new RoomData("조금좋은 원룸입니다.", 1500, 45, true, "원룸", 2, 26, 0));
        roomDataList.add(new RoomData("전세 투룸", 15000, 0, true, "투룸", 0, 36.3, 10000));

        List<String> tags0 = roomDataList.get(0).getHashTags();
        tags0.add("주차");
        tags0.add("반려동물");

        List<String> tags1 = roomDataList.get(1).getHashTags();
        tags1.add("주차");
        tags1.add("단기가능");

        List<String> tags2 = roomDataList.get(2).getHashTags();
        tags2.add("주차");

        List<String> tags3 = roomDataList.get(3).getHashTags();
        tags3.add("반려동물");


        roomAdapter = new RoomAdapter(RoomListPraticeActivity.this, roomDataList);
        roomListView.setAdapter(roomAdapter);

    }
}
