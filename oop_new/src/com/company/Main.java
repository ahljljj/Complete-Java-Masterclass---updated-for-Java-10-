package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("model is " + porsche.getModel());

        VipCustomer tom = new VipCustomer();
        System.out.println("tom's name = " + tom.getName());

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        dog d = new dog("yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        d.eat();
        d.walk();
        d.run();




    }
}
