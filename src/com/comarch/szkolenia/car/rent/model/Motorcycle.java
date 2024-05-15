package com.comarch.szkolenia.car.rent.model;

import java.awt.font.TextHitInfo;

public class Motorcycle extends Vehicle {
    private boolean additionalSeat;

    public Motorcycle(String brand, String model, double price,
                      String plate, boolean additionalSeat) {
        super(brand, model, price, plate, false);
        this.additionalSeat = additionalSeat;
    }

    public boolean isAdditionalSeat() {
        return additionalSeat;
    }

    public void setAdditionalSeat(boolean additionalSeat) {
        this.additionalSeat = additionalSeat;
    }

    @Override
    public String toString() {
        return super.toString() + " Dodatowe miejsce: " + (this.additionalSeat ? "Tak" : "Nie");
    }
}
