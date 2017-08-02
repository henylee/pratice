package kr.co.tjeit.viewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.viewexample.adapters.CarSpinnerAdapter;
import kr.co.tjeit.viewexample.adapters.PhoneSpinnetAdapter;

public class SpinnerPraticeActivity extends AppCompatActivity {

    private Spinner carListSpinner;
    List<String> carList = new ArrayList<>();
    CarSpinnerAdapter carSpinnerAdapter;

    private Spinner phoneNameSpinner;
    List<String> phoneList = new ArrayList<>();
    PhoneSpinnetAdapter phoneSpinnetAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_pratice);

        carListSpinner = (Spinner) findViewById(R.id.carListSpinner);
        phoneNameSpinner = (Spinner) findViewById(R.id.phoneNameSpinner);

        carList.add("현대");
        carList.add("기아");
        carList.add("르노");
        carList.add("쉐보레");
        carList.add("쌍용");

        phoneList.add("갤럭시");
        phoneList.add("아이폰7");
        phoneList.add("G7");
        phoneList.add("MI시리즈");
        phoneList.add("RAZA");

        carSpinnerAdapter = new CarSpinnerAdapter(SpinnerPraticeActivity.this, carList);
        carListSpinner.setAdapter(carSpinnerAdapter);

        phoneSpinnetAdapter = new PhoneSpinnetAdapter(SpinnerPraticeActivity.this, phoneList);
        phoneNameSpinner.setAdapter(phoneSpinnetAdapter);

    }
}
