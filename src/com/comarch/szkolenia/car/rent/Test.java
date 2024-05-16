package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Car car = new Car(); // 158
        car.setBrand("BMW");
        System.out.println(car.getBrand());

        CarRepository carRepository = new CarRepository();
        //carRepository.changeCar(car);

        System.out.println(car.getBrand());*/

        /*Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Wczytalismy:");
        System.out.println(s);*/

        /*final int JAKAS_STALA = 5;
        System.out.println(JAKAS_STALA);

        final Vehicle VEHICLE = new Vehicle();
        VEHICLE.setBrand("BMW");
        System.out.println(VEHICLE);
        VEHICLE.setBrand("Audi");
        System.out.println(VEHICLE);*/

        //VEHICLE = new Vehicle();

        Test2.surname = "Kowalski";

        Test2 t2 = new Test2();
        t2.name = "Karol";
        t2.surname = "Malinowski";

        Test2 t3 = new Test2();
        t3.name = "Janusz";
        t3.surname = "Wisniewski";

        System.out.println(t2.name);
        System.out.println(t2.surname);
        System.out.println(t3.name);
        System.out.println(t3.surname);
        System.out.println(Test2.surname);
    }
}
