package com.example.rrtest.Pojo;

import android.graphics.Bitmap;

public class GridviewPojo
{
    String learnTv , watchTv ;
    int imgId;

    public GridviewPojo(String learnTv, String watchTv, int imgId) {
        this.learnTv = learnTv;
        this.watchTv = watchTv;
        this.imgId = imgId;
    }

    public String getLearnTv() {
        return learnTv;
    }

    public void setLearnTv(String learnTv) {
        this.learnTv = learnTv;
    }

    public String getWatchTv() {
        return watchTv;
    }

    public void setWatchTv(String watchTv) {
        this.watchTv = watchTv;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
