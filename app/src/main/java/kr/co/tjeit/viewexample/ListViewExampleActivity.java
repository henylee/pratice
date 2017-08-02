package kr.co.tjeit.viewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewExampleActivity extends AppCompatActivity {

    private ListView myListView;
    List<String> carBrands = new ArrayList<String>();
    ArrayAdapter<String> myArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);

        myListView = (ListView) findViewById(R.id.myListView);
        carBrands.add("Benz");
        carBrands.add("BMW");
        carBrands.add("Ford");
        carBrands.add("현대");
        carBrands.add("삼성르노");
        // 뷰를 매칭한다. => 매핑, XML과 JAVA를 연결하는 경우.

        myArrayAdapter = new ArrayAdapter<String>(ListViewExampleActivity.this, android.R.layout.simple_list_item_1, carBrands);
        myListView.setAdapter(myArrayAdapter);
    }
}
