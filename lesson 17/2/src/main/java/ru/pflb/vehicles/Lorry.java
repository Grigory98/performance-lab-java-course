package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Lorry extends Car {
    public Lorry(String model, VehicleClass vehicleClass, int weight, int loadingAmount, Engine engine, Driver driver) {
        super(model, vehicleClass, weight, engine, driver);
        this.loadingAmount = loadingAmount;
    }
    public int loadingAmount;

    @Override
    public String toString() {
        return "Модель: " + model + ", класс: " + vehicleClass + "\n" +
                "Характеристики: \n" + "\tвес: " + weight + "\n" + "\tдвигатель: " + engine.toString() + "\n" + "\tгрузоподъемность: " + loadingAmount + "\n" +
                "Водитель: " + driver.name;
    }
}
