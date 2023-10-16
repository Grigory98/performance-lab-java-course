package org.example;

public class Horse extends Animal {
    public static int counter;
    public Horse(String location, HealthStates healthState) {
        this.location = location;
        this.HealthState = healthState;
        Horse.counter++;
    }

    @Override
    public void makeSound() {
        System.out.println("Иго-го!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    public String toString() {
        return "Страна обитания: " + location + "\n" + "Состояние здоровья: " + HealthState + "\n" + "Количество лошадей: " + counter;
    }
}
