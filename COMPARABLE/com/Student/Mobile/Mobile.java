package com.Student.Mobile;

public class Mobile implements Comparable<Mobile>{
    String Brand;
    int price;

    Mobile(String Brand, int price){
        this.Brand = Brand;
        this.price = price;
    }

    @Override
    public int compareTo(Mobile mobile) {
        return this.price - mobile.price;
    }

    @Override
    public String toString() {
        return  "Mobile: " +
                "Price : " + price;
    }
}
