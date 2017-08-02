package kr.co.tjeit.viewexample.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.viewexample.R;
import kr.co.tjeit.viewexample.data.RoomData;

/**
 * Created by the on 2017-08-01.
 */

public class RoomAdapter extends ArrayAdapter<RoomData> {

    Context mContext;
    List<RoomData> mList;
    LayoutInflater inf; // 메모리 절약

    public RoomAdapter(Context context, List<RoomData> list) {
        super(context, R.layout.room_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.room_list_item, null);
        }

        RoomData myRoomData = mList.get(position);

        TextView rentPayTxt = (TextView) row.findViewById(R.id.rentPayTxt);
        TextView titleTxt = (TextView) row.findViewById(R.id.titleTxt);
        TextView isMonthPayTxt = (TextView) row.findViewById(R.id.isMonthPayTxt);
        TextView roominfoTxt = (TextView) row.findViewById(R.id.roominfoTxt);
        TextView stairTxt = (TextView) row.findViewById(R.id.stairTxt);
        TextView roomSizeTxt = (TextView) row.findViewById(R.id.roomSizeTxt);
        TextView monthPayTxt = (TextView) row.findViewById(R.id.monthPayTxt);
        ImageView heartima = (ImageView) row.findViewById(R.id.heartima);
        TextView tagTest1 = (TextView) row.findViewById(R.id.tagTest1);
        TextView tagTest2 = (TextView) row.findViewById(R.id.tagTest2);
        TextView tagTest3 = (TextView) row.findViewById(R.id.tagTest3);
        TextView tagTest4 = (TextView) row.findViewById(R.id.tagTest4);

        List<TextView> tags = new ArrayList<TextView>();
        tags.add(tagTest1);
        tags.add(tagTest2);
        tags.add(tagTest3);
        tags.add(tagTest4);

        for (TextView tag : tags) {
            tag.setVisibility(View.GONE);
        }

        for (int i=0; i<myRoomData.getHashTags().size(); i++) {
            TextView tag = tags.get(i);
            tag.setVisibility(View.VISIBLE);
            tag.setText("#"+myRoomData.getHashTags().get(i));
        }

        if(myRoomData.getRoomRantPay()>0) {
            rentPayTxt.setText(myRoomData.getRoomDeposit() + " / " + myRoomData.getRoomRantPay());
        }
        else {
            if (myRoomData.getRoomDeposit()>10000) {
                rentPayTxt.setText((myRoomData.getRoomDeposit()/10000) + "억" + ((myRoomData.getRoomDeposit()%10000)/1000) + "천");
            }
            else {
                rentPayTxt.setText(myRoomData.getRoomDeposit()+"만");
            }

        }

        titleTxt.setText(myRoomData.getRoomTitle());

        if (myRoomData.getRoomRantPay()>0) {
            isMonthPayTxt.setText("월세");
        }
        else {
            isMonthPayTxt.setText("전세");
            isMonthPayTxt.setBackgroundResource(R.color.orange);
        }

        roominfoTxt.setText(myRoomData.getRoomType());

        if (myRoomData.getStairNum()<0) {
            stairTxt.setText("지하" + (-myRoomData.getStairNum()) + "층" );
        }
        else if (myRoomData.getStairNum() ==0) {
            stairTxt.setText("반지하");
        }
        else {
            stairTxt.setText(myRoomData.getStairNum() + "층");
        }

        roomSizeTxt.setText(myRoomData.getRoomSize()+"㎡");
        if (myRoomData.getManagePay()==0) {
            monthPayTxt.setText("관리비 없음");
        }
        else {
            monthPayTxt.setText("관리비 " + (myRoomData.getManagePay()/10000) + "만원");
        }

        if (myRoomData.isLikeByUser()) {
            heartima.setImageResource(R.drawable.heart);
        }
        else {
            heartima.setImageResource(R.drawable.empty_heart);
        }

        return row;
    }
}
