package com.example.myapplication001;

public class sliderModel {

    private int banner;
    private String backgroundColor;

    public sliderModel(int banner, String backgroundColor) {
        this.banner = banner;
        this.backgroundColor = backgroundColor;
    }

    public int getBanner() {
        return banner;
    }

    public void setBanner(int banner) {
        this.banner = banner;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
