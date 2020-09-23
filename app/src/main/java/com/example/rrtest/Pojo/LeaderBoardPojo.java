package com.example.rrtest.Pojo;

import android.graphics.Bitmap;

public class LeaderBoardPojo {
    String name ;
    long position;
    long points;
    int imgid;

    public LeaderBoardPojo(long position, String name, int imgid,long points) {
        this.position = position;
        this.name = name;
        this.points = points;
        this.imgid = imgid;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
