package com.comarch.szkolenia.car.rent.core;

import com.comarch.szkolenia.car.rent.db.VehicleRepository;
import com.comarch.szkolenia.car.rent.gui.Gui;

public class Core {
    private final VehicleRepository vehicleRepository = new VehicleRepository();
    public void start() {
        boolean run = true;
        while(run) {
            switch(Gui.showMenuAndReadChoose()) {
                case "1":
                    Gui.listVehicles(vehicleRepository.getVehicles());
                    break;
                case "2":
                    Gui.showResult(vehicleRepository.rent(Gui.readPlate()));
                    break;
                case "3":
                    Gui.showResult(vehicleRepository.receive(Gui.readPlate()));
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    Gui.showWrongChoose();
                    break;
            }
        }
    }
}
