package com.example.app1;

public class ChuViVuong {

    //chiều dài cạnh (sizeCanh)
    private double sizeCanh;

    // Constructor
    public ChuViVuong(double sizeCanh) {
        this.sizeCanh = sizeCanh;
    }

    //tính chu vi
    public double calculatePerimeter() {
        return 4 * sizeCanh; // Chu vi hình vuông = 4 * cạnh
    }

    // Getter và Setter
    public double getSizeCanh() {
        return sizeCanh;
    }

    public void setSizeCanh(double sizeCanh) {
        this.sizeCanh = sizeCanh;
    }
}
