package com.comarch.szkolenia.car.rent.model;

public class Truck extends Vehicle {

    private int capacity;

    public Truck(String brand, String model, double price, String plate, int capacity) {
        super(brand, model, price, plate, false);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + " Pojemność: " + this.capacity;
    }
}
