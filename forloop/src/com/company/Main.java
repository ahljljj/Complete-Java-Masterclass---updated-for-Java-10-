package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }


    }

    public static double calculateInterest(double amount, double rate){
        return amount*rate/100;
    }
}
