package kr.co.tjeit.viewexample.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-08-01.
 */

public class RoomData {

    private String roomTitle;
    private int roomDeposit;
    private int roomRantPay;

    private boolean isLikeByUser;

    private String RoomType;
    private int stairNum;
    private double roomSize;
    private int managePay;

    private List<String> hashTags = new ArrayList<String>();

    public RoomData () {

    }

    public RoomData(String roomTitle, int roomDeposit, int roomRantPay, boolean isLikeByUser, String roomType, int stairNum, double roomSize, int managePay) {
        this.roomTitle = roomTitle;
        this.roomDeposit = roomDeposit;
        this.roomRantPay = roomRantPay;
        this.isLikeByUser = isLikeByUser;
        this.RoomType = roomType;
        this.stairNum = stairNum;
        this.roomSize = roomSize;
        this.managePay = managePay;
    }

    public String getRoomTitle() {
        return roomTitle;
    }

    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    public int getRoomDeposit() {
        return roomDeposit;
    }

    public void setRoomDeposit(int roomDeposit) {
        this.roomDeposit = roomDeposit;
    }

    public int getRoomRantPay() {
        return roomRantPay;
    }

    public void setRoomRantPay(int roomRantPay) {
        this.roomRantPay = roomRantPay;
    }

    public boolean isLikeByUser() {
        return isLikeByUser;
    }

    public void setLikeByUser(boolean likeByUser) {
        isLikeByUser = likeByUser;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public int getStairNum() {
        return stairNum;
    }

    public void setStairNum(int stairNum) {
        this.stairNum = stairNum;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public int getManagePay() {
        return managePay;
    }

    public void setManagePay(int managePay) {
        this.managePay = managePay;
    }

    public List<String> getHashTags() {
        return hashTags;
    }

    public void setHashTags(List<String> hashTags) {
        this.hashTags = hashTags;
    }

    @Override
    public String toString() {
        String str=this.roomTitle + " - " + this.roomDeposit + " / " + this.roomRantPay;
        return str;
    }
}
