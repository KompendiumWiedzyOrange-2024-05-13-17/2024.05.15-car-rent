package com.comarch.szkolenia.car.rent.core;

import com.comarch.szkolenia.car.rent.db.VehicleRepository;
import com.comarch.szkolenia.car.rent.gui.Gui;

public class Core {
    private final VehicleRepository vehicleRepository = new VehicleRepository();
    private final Gui gui = new Gui();
    public void start() {
        boolean run = true;
        while(run) {
            switch(gui.showMenuAndReadChoose()) {
                case "1":
                    gui.listVehicles(vehicleRepository.getVehicles());
                    break;
                case "2":
                    gui.showResult(vehicleRepository.rent(gui.readPlate()));
                    break;
                case "3":
                    gui.showResult(vehicleRepository.receive(gui.readPlate()));
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
