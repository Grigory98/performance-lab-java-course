package ru.pflb.details;

public class Engine {
    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }
    public int power;
    public String vendor;

    public String toString() {
        return "Двигатель: " + power + "\n" + "Производитель: " + vendor;
    }
}
