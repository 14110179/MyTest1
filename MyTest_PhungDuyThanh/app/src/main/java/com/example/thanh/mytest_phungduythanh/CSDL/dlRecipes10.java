package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 7/5/2017.
 */

public class dlRecipes10 {
    private String Name1;
    private String Name2;
    private int UrlImage;

    public dlRecipes10(String name1, String name2, int urlImage) {
        Name1 = name1;
        Name2 = name2;
        UrlImage = urlImage;
    }

    public String getName1() {
        return Name1;
    }

    public void setName1(String name1) {
        Name1 = name1;
    }

    public String getName2() {
        return Name2;
    }

    public void setName2(String name2) {
        Name2 = name2;
    }

    public int getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(int urlImage) {
        UrlImage = urlImage;
    }
}
