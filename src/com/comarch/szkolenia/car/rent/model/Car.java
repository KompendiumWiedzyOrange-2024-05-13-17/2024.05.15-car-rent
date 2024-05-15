package com.comarch.szkolenia.car.rent.model;

public class Car extends Vehicle {

    public Car(String brand, String model, double price, String plate) {
        super(brand, model, price, plate, false);
    }

    public Car() {
    }
}
