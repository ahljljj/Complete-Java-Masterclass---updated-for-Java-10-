package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int myintvalue = 5;
        float myfloatvalue = 100f;
        double mydoublevalue = 5d;
        System.out.println("myinvalue " + myintvalue);
        System.out.println("myfloatvalue " + myfloatvalue);
        System.out.println("mydoublevalue " + mydoublevalue);
        if (myfloatvalue < 100) {
            System.out.println("small number");
        } else if (myfloatvalue == 100) {
            System.out.println("myvalue is equal to 100");
        } else {
            System.out.println("myvalue is more than 100");
        }
    }
}
