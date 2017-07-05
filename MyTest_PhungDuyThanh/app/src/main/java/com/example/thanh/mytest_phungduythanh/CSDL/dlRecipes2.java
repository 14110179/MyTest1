package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 6/29/2017.
 */

public class dlRecipes2 {
    private String name;
    private String minutes;
    private int UrlImage;

    public dlRecipes2(String name, String minutes, int urlImage) {
        this.name = name;
        this.minutes = minutes;
        UrlImage = urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public int getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(int urlImage) {
        UrlImage = urlImage;
    }
}
