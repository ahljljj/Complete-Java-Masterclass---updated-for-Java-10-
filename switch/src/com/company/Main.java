package com.company;

public class Main {

    public static void main(String[] args) {
	int value = 2;
	System.out.println("myvalue: "+ value);

	int switchvalue = 3;
	switch (switchvalue){
        case 1:
            System.out.println("was 1");
            break;
        case 2:
            System.out.println("was 2");
            break;
        default:
            System.out.println("was not 1 or 2");
            break;
    }

    }
}
