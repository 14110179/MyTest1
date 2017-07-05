package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 6/29/2017.
 */

public class dlActivity {
    private String Name1;
    private String Name2;
    private String Name3;
    private int UrlImage;

    public dlActivity(String name1, String name2, String name3, int urlImage) {
        Name1 = name1;
        Name2 = name2;
        Name3 = name3;
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

    public String getName3() {
        return Name3;
    }

    public void setName3(String name3) {
        Name3 = name3;
    }

    public int getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(int urlImage) {
        UrlImage = urlImage;
    }
}
