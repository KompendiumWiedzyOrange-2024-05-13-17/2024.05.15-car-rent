package com.comarch.szkolenia.car.rent.db;

import com.comarch.szkolenia.car.rent.model.Car;

public class CarRepository {
    private Car[] cars = new Car[5];

    public CarRepository() {
        this.cars[0] = new Car("BMW", "3", 300.0, "KR11");
        this.cars[1] = new Car("Kia", "Ceed", 200.0, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla", 200.0, "KR33");
        this.cars[3] = new Car("Fiat", "126p", 150.0, "KR44");
        this.cars[4] = new Car("Audi", "A5", 400.0, "KR55");
    }

    public boolean rentCar(String plate) {
        Car car = findCar(plate);
        if(car != null && !car.isRent()) {
            car.setRent(true);
            return true;
        }
        return false;
    }

    public boolean returnCar(String plate) {
        Car car = findCar(plate);
        if(car != null && car.isRent()) {
            car.setRent(false);
            return true;
        }
        return false;
    }

    public Car[] getCars() {
        return this.cars;
    }

    private Car findCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate)) {
                return car;
            }
        }
        return null;
    }

    /*public void changeCar(Car car) {
        car.setBrand("Cos");
    }*/
}
