package com.example.newapp;

public class Item {

    private int image;
    private String ten;
    private String gia;

    public Item(int image, String ten, String gia) {
        this.image = image;
        this.ten = ten;
        this.gia = gia;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
