package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 6/28/2017.
 */

public class dlHome2 {
    private String txtName1;
    private String txtName2;
    private String txtName3;
    private int urlAvatar;

    public dlHome2(String txtName1, String txtName2, String txtName3, int urlAvatar) {
        this.txtName1 = txtName1;
        this.txtName2 = txtName2;
        this.txtName3 = txtName3;
        this.urlAvatar = urlAvatar;
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

    public String getTxtName3() {
        return txtName3;
    }

    public void setTxtName3(String txtName3) {
        this.txtName3 = txtName3;
    }

    public int getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(int urlAvatar) {
        this.urlAvatar = urlAvatar;
    }
}
