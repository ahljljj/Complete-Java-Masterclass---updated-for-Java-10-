package com.company;

public class Main {

    public static void main(String[] args) {
        int myintvalue = 50;
        float myfloatvalue = 10f;
        double mydoublevalue = 5.2d;
        calculator(myintvalue, myfloatvalue, mydoublevalue);



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
    public static void calculator(int myintvalue, float myfloatvalue, double mydoublevalue){

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
