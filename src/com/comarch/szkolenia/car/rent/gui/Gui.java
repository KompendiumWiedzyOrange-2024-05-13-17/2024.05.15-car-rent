package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class Gui {
    Scanner scanner = new Scanner(System.in);

    public String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");
        return scanner.nextLine();
    }

    public void listCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(car.getBrand() + " " +
                    car.getModel() + " Cena: " +
                    car.getPrice() + " Rejestracja: " +
                    car.getPlate() + " Rent: " +
                    car.isRent());
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
