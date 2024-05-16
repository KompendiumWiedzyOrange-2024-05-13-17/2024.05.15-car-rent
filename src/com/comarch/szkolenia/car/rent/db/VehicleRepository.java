package com.comarch.szkolenia.car.rent.db;

import com.comarch.szkolenia.car.rent.model.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    private final Map<String, Vehicle> vehicles = new HashMap<>();

    public VehicleRepository() {
        this.vehicles.put("KR11", new Car("BMW", "3", 300.0, "KR11"));
        this.vehicles.put("KR22", new Car("Kia", "Ceed", 200.0, "KR22"));
        this.vehicles.put("KR33", new Car("Toyota", "Corolla", 200.0, "KR33"));
        this.vehicles.put("KR44", new Car("Fiat", "126p", 150.0, "KR44"));
        this.vehicles.put("KR55", new Car("Audi", "A5", 400.0, "KR55"));
        this.vehicles.put("KR666", new Bus("Solaris", "Super", 700.0, "KR666", 52));
        this.vehicles.put("KR777", new Bus("Mercedes", "E100", 900.0, "KR777", 60));
        this.vehicles.put("KR8", new Truck("Scania", "Jakas", 900.0, "KR8", 14));
        this.vehicles.put("KR99", new Motorcycle("Yamaha", "T100", 300.0,
                "KR99", false));
        this.vehicles.put("KR10", new Motorcycle("Harley", "Super", 500.0,
                "KR10", true));
    }

    public boolean rent(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if(vehicle != null && !vehicle.isRent()) {
            vehicle.setRent(true);
            return true;
        }
        return false;
    }

    public boolean receive(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if(vehicle != null && vehicle.isRent()) {
            vehicle.setRent(false);
            return true;
        }
        return false;
    }

    public Collection<Vehicle> getVehicles() {
        return this.vehicles.values();
    }

    /*public void changeCar(Car car) {
        car.setBrand("Cos");
    }*/
}
