package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.db.CarRepository;
import com.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Car car = new Car(); // 158
        car.setBrand("BMW");
        System.out.println(car.getBrand());

        CarRepository carRepository = new CarRepository();
        //carRepository.changeCar(car);

        System.out.println(car.getBrand());*/

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Wczytalismy:");
        System.out.println(s);
    }
}
