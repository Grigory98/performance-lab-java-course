package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Car {
    public Car(String model, VehicleClass vehicleClass, int weight, Engine engine, Driver driver) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }
    public String model;
    public VehicleClass vehicleClass;
    public int weight;
    public Driver driver;
    public Engine engine;

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        return "Модель: " + model + ", класс: " + vehicleClass + "\n" +
                "Характеристики: \n" + "\tвес: " + weight + "\n" + "\tдвигатель: " + engine.toString() + "\n" +
                "Водитель: " + driver.name;
    }
}
