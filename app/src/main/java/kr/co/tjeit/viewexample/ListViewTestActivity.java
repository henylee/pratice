package kr.co.tjeit.viewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.viewexample.adapters.PhoenDataSpinnerAdapter;
import kr.co.tjeit.viewexample.adapters.PhoneAdapter;
import kr.co.tjeit.viewexample.data.PhoneData;

public class ListViewTestActivity extends AppCompatActivity {

    private ListView myList;
    private Spinner phoneSpinner;
    List<PhoneData> phoneBrands = new ArrayList<PhoneData>();

    PhoneAdapter phoneAdapter;
    PhoenDataSpinnerAdapter phoenDataSpinnerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);

        this.myList = (ListView) findViewById(R.id.myList);
        phoneSpinner = (Spinner) findViewById(R.id.phoneSpinner);

        phoneBrands.add(new PhoneData("삼성", "갤럭시7"));
        phoneBrands.add(new PhoneData("애플", "아이폰6"));
        phoneBrands.add(new PhoneData("LG", "G7"));
        phoneBrands.add(new PhoneData("샤오미", "MI"));
        phoneBrands.add(new PhoneData("모토로라", "RAZA"));
        phoneBrands.add(new PhoneData("삼성", "갤럭시8"));
        phoneBrands.add(new PhoneData("삼성", "갤럭시6"));
        phoneBrands.add(new PhoneData("삼성", "갤럭시 노트5"));
        phoneBrands.add(new PhoneData("삼성", "갤럭시 노트7"));
        phoneBrands.add(new PhoneData("삼성", "옴니아"));

        phoneAdapter = new PhoneAdapter(ListViewTestActivity.this, phoneBrands);
        myList.setAdapter(phoneAdapter);

        phoenDataSpinnerAdapter = new PhoenDataSpinnerAdapter(ListViewTestActivity.this, phoneBrands);
        phoneSpinner.setAdapter(phoenDataSpinnerAdapter);
    }
}
