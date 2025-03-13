package com.student.Mobile;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Mobile> mobileList = new ArrayList<>();
        System.out.println("**************MOBILE'S DETAILS**************");
        mobileList.add(new Mobile("Samsung", "Galaxy S23", 999.99, 2023, "Sky Blue", 8, 128));
        mobileList.add(new Mobile("Apple", "iPhone 14", 1099.99, 2022, "Black", 8, 128));
        mobileList.add(new Mobile("OnePlus", "10 Pro", 899.99, 2022, "Red", 12, 256));
        mobileList.add(new Mobile("Google", "Pixel 7", 799.99, 2022, "White", 8, 128));
        mobileList.add(new Mobile("Xiaomi", "Mi 11", 749.99, 2021, "Gray", 8, 128));
        mobileList.add(new Mobile("Sony", "Xperia 1 III", 1199.99, 2021, "Purple", 12, 256));
        mobileList.add(new Mobile("Oppo", "Find X5 Pro", 1099.99, 2022, "Green", 12, 256));
        mobileList.add(new Mobile("Realme", "GT 2 Pro", 899.99, 2022, "Blue", 8, 128));
        mobileList.add(new Mobile("Motorola", "Edge 20 Pro", 699.99, 2021, "Silver", 8, 128));
        mobileList.add(new Mobile("Huawei", "P40 Pro", 1099.99, 2020, "Black", 8, 128));


        for (int i = 0; i<mobileList.size(); i++){
            Mobile mobile = mobileList.get(i);
            mobile.displayInfo();
            System.out.println();
        }
    }
}
