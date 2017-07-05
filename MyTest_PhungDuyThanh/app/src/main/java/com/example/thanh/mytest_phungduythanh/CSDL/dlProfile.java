package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 6/28/2017.
 */

public class dlProfile {
    private String txtName1;
    private String txtName2;
    private int UrlImage;

    public dlProfile(String txtName1, String txtName2, int urlImage) {
        this.txtName1 = txtName1;
        this.txtName2 = txtName2;
        UrlImage = urlImage;
    }

    public String getTxtName1() {
        return txtName1;
    }

    public void setTxtName1(String txtName1) {
        this.txtName1 = txtName1;
    }

    public String getTxtName2() {
        return txtName2;
    }

    public void setTxtName2(String txtName2) {
        this.txtName2 = txtName2;
    }

    public int getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(int urlImage) {
        UrlImage = urlImage;
    }
}
