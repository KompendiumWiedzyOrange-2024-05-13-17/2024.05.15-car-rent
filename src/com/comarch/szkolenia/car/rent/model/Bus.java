package com.comarch.szkolenia.car.rent.model;

public class Bus extends Vehicle {

    private int seats;

    public Bus(String brand, String model, double price, String plate, int seats) {
        super(brand, model, price, plate, false);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + " Liść miejsc: " + this.seats;
    }
}
