package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 6/28/2017.
 */

public class dlRecipes {
    private String Name1;
    private String Name2;
    private int urlImage;

    public dlRecipes(String name1, String name2, int urlImage) {
        Name1 = name1;
        Name2 = name2;
        this.urlImage = urlImage;
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
        return urlImage;
    }

    public void setUrlImage(int urlImage) {
        this.urlImage = urlImage;
    }
}
