package com.darwinjacob;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        Car holden = new Car();

        System.out.println("Model is " + toyota.getModel());
        toyota.setModel("Yaris");
        toyota.setModel("jazz");

        System.out.println("Model is " + toyota.getModel());
    }
}
