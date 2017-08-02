package kr.co.tjeit.viewexample.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import kr.co.tjeit.viewexample.R;
import kr.co.tjeit.viewexample.data.PhoneData;
import kr.co.tjeit.viewexample.data.RoomData;

/**
 * Created by the on 2017-08-01.
 */

public class PhoneAdapter extends ArrayAdapter<PhoneData> {

    Context mContext;
    List<PhoneData> mList;
    LayoutInflater inf;

    public PhoneAdapter (Context context, List<PhoneData> list) {
        super(context, R.layout.phone_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.phone_list_item, null);
        }

        PhoneData data = mList.get(position);

        TextView modelNameTxt = (TextView) row.findViewById(R.id.modelNameTxt);
        TextView makerTxt = (TextView) row.findViewById(R.id.makerTxt);

        modelNameTxt.setText(data.getModelName());
        makerTxt.setText(data.getMaker());

        return row;
    }
}
