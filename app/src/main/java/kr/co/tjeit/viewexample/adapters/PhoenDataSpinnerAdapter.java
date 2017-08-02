package kr.co.tjeit.viewexample.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import kr.co.tjeit.viewexample.R;
import kr.co.tjeit.viewexample.data.PhoneData;

/**
 * Created by the on 2017-08-02.
 */

public class PhoenDataSpinnerAdapter extends ArrayAdapter<PhoneData> {

    Context mContext;
    List<PhoneData> mList;
    LayoutInflater inf;

    public PhoenDataSpinnerAdapter(Context context, List<PhoneData> list) {
        super(context, R.layout.phone_spinner_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.phone_spinner_display_item, null);
        }

        PhoneData data = mList.get(position);

        TextView phoneNmaeTxt = (TextView) row.findViewById(R.id.phoneNmaeTxt);
        TextView phoneMakerTxt = (TextView) row.findViewById(R.id.phoneMakerTxt);
        phoneNmaeTxt.setText(data.getModelName());
        return row;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if(row==null) {
            row = inf.inflate(R.layout.phone_spinner_list_item, null);
        }

        PhoneData data = mList.get(position);

        TextView phoneNmaeTxt = (TextView) row.findViewById(R.id.phoneNmaeTxt);
        TextView phoneMakerTxt = (TextView) row.findViewById(R.id.phoneMakerTxt);
        phoneNmaeTxt.setText(data.getMaker());

        return row;
    }


}
