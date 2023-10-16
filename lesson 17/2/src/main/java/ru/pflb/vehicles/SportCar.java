package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class SportCar extends Car {
    public SportCar(String model, int weight, float maxVelocity, Engine engine, Driver driver) {
        super(model, VehicleClass.SPORTS_CAR, weight, engine, driver);
        this.maxVelocity = maxVelocity;
    }
    public float maxVelocity;

    @Override
    public String toString() {
        return "Модель: " + model + ", класс: " + vehicleClass + "\n" +
                "Характеристики: \n" + "\tвес: " + weight + "\n" + "\tдвигатель: " + engine.toString() + "\n" + "\tмаксимальная скорость(км/ч): " + maxVelocity + "\n" +
                "Водитель: " + driver.name;
    }
}
