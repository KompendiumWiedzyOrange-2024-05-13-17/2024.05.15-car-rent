package com.comarch.szkolenia.car.rent.core;

import com.comarch.szkolenia.car.rent.db.CarRepository;
import com.comarch.szkolenia.car.rent.gui.Gui;

public class Core {
    public void start() {
        CarRepository carRepository = new CarRepository();
        Gui gui = new Gui();
        boolean run = true;
        while(run) {
            switch(gui.showMenuAndReadChoose()) {
                case "1":
                    gui.listCars(carRepository.getCars());
                    break;
                case "2":
                    gui.showResult(carRepository.rentCar(gui.readPlate()));
                    break;
                case "3":
                    gui.showResult(carRepository.returnCar(gui.readPlate()));
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    gui.showWrongChoose();
                    break;
            }
        }
    }
}
