package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 7/1/2017.
 */

public class dlDirection25 {
    private int UrlImage1;
    private int UrlImage2;
    private String txtNoiDung;

    public dlDirection25(int urlImage1, int urlImage2, String txtNoiDung) {
        UrlImage1 = urlImage1;
        UrlImage2 = urlImage2;
        this.txtNoiDung = txtNoiDung;
    }

    public int getUrlImage1() {
        return UrlImage1;
    }

    public void setUrlImage1(int urlImage1) {
        UrlImage1 = urlImage1;
    }

    public int getUrlImage2() {
        return UrlImage2;
    }

    public void setUrlImage2(int urlImage2) {
        UrlImage2 = urlImage2;
    }

    public String getTxtNoiDung() {
        return txtNoiDung;
    }

    public void setTxtNoiDung(String txtNoiDung) {
        this.txtNoiDung = txtNoiDung;
    }
}
