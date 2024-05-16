package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;
import java.util.Scanner;

public class Gui {
    private static final Scanner scanner = new Scanner(System.in);

    public static String showMenuAndReadChoose() {
        System.out.println("1. List vehicles");
        System.out.println("2. Rent vehicle");
        System.out.println("3. Return vehicle");
        System.out.println("4. Exit");
        return scanner.nextLine();
    }

    public static void listVehicles(Collection<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public static void showResult(boolean result) {
        if (result) {
            System.out.println("Success !!");
        } else {
            System.out.println("Error !!");
        }
    }

    public static void showWrongChoose() {
        System.out.println("Wrong choose ! Try again !");
    }
}
