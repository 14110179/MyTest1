package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 6/28/2017.
 */

public class dlHome {
    private String txtName1;
    private String txtName2;
    private String txtSoTim;
    private int urlAvatar;
    private int urlImage;

    public dlHome(String txtName1, String txtName2, String txtSoTim, int urlAvatar, int urlImage) {
        this.txtName1 = txtName1;
        this.txtName2 = txtName2;
        this.txtSoTim = txtSoTim;
        this.urlAvatar = urlAvatar;
        this.urlImage = urlImage;
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

    public String getTxtSoTim() {
        return txtSoTim;
    }

    public void setTxtSoTim(String txtSoTim) {
        this.txtSoTim = txtSoTim;
    }

    public int getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(int urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

    public int getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(int urlImage) {
        this.urlImage = urlImage;
    }
}
