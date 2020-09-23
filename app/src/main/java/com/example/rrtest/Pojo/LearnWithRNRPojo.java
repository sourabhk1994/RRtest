package com.example.rrtest.Pojo;

import android.graphics.Bitmap;

public class LearnWithRNRPojo {
    String title,subtitle ;
    int subImg;

    public LearnWithRNRPojo(String title, String subtitle, int subImg) {
        this.title = title;
        this.subtitle = subtitle;
        this.subImg = subImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getSubImg() {
        return subImg;
    }

    public void setSubImg(int subImg) {
        this.subImg = subImg;
    }
}

