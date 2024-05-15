package com.comarch.szkolenia.car.rent.db;

import com.comarch.szkolenia.car.rent.model.*;

public class VehicleRepository {
    private final Vehicle[] vehicles = new Vehicle[10];

    public VehicleRepository() {
        this.vehicles[0] = new Car("BMW", "3", 300.0, "KR11");
        this.vehicles[1] = new Car("Kia", "Ceed", 200.0, "KR22");
        this.vehicles[2] = new Car("Toyota", "Corolla", 200.0, "KR33");
        this.vehicles[3] = new Car("Fiat", "126p", 150.0, "KR44");
        this.vehicles[4] = new Car("Audi", "A5", 400.0, "KR55");
        this.vehicles[5] = new Bus("Solaris", "Super", 700.0, "KR666", 52);
        this.vehicles[6] = new Bus("Mercedes", "E100", 900.0, "KR777", 60);
        this.vehicles[7] = new Truck("Scania", "Jakas", 900.0, "KR8", 14);
        this.vehicles[8] = new Motorcycle("Yamaha", "T100", 300.0,
                "KR99", false);
        this.vehicles[9] = new Motorcycle("Harley", "Super", 500.0,
                "KR10", true);
    }

    public boolean rent(String plate) {
        Vehicle vehicle = findVehicle(plate);
        if(vehicle != null && !vehicle.isRent()) {
            vehicle.setRent(true);
            return true;
        }
        return false;
    }

    public boolean receive(String plate) {
        Vehicle vehicle = findVehicle(plate);
        if(vehicle != null && vehicle.isRent()) {
            vehicle.setRent(false);
            return true;
        }
        return false;
    }

    public Vehicle[] getVehicles() {
        return this.vehicles;
    }

    private Vehicle findVehicle(String plate) {
        for(Vehicle vehicle : this.vehicles) {
            if(vehicle.getPlate().equals(plate)) {
                return vehicle;
            }
        }
        return null;
    }

    /*public void changeCar(Car car) {
        car.setBrand("Cos");
    }*/
}
