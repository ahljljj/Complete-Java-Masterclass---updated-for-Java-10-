package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myvalue = 100;
        byte mybytevalue = 10;
        short myshortvalue = 200;
        long mylongvalue = 50000L + 10L * (mybytevalue + myshortvalue + myvalue);
        short shortvalue = (short) (500 + 10 * (mybytevalue + myshortvalue + myvalue));


        System.out.println("mylongvalue " + mylongvalue);
        System.out.println("myshortvalue "+ shortvalue);
    }
}
