package com.example.test.model;

public class NhanVien {
    private String code;
    private String name;
    private int img;
    private String gender;

    public NhanVien() {
    }

    public NhanVien(String code, String name, int img) {
        this.code = code;
        this.name = name;
        this.img = img;
    }

    public NhanVien(String code, String name, int img, String gender) {
        this.code = code;
        this.name = name;
        this.img = img;
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return code + "-" + name ;
    }
}
