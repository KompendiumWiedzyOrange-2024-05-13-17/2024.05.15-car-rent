package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Car;
import com.comarch.szkolenia.car.rent.model.Truck;
import com.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Scanner;

public class Gui {
    private final Scanner scanner = new Scanner(System.in);

    public String showMenuAndReadChoose() {
        System.out.println("1. List vehicles");
        System.out.println("2. Rent vehicle");
        System.out.println("3. Return vehicle");
        System.out.println("4. Exit");
        return scanner.nextLine();
    }

    public void listVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public void showResult(boolean result) {
        if (result) {
            System.out.println("Success !!");
        } else {
            System.out.println("Error !!");
        }
    }

    public void showWrongChoose() {
        System.out.println("Wrong choose ! Try again !");
    }
}
