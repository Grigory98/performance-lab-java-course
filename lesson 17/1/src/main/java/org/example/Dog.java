package org.example;

public class Dog extends Animal {
    public static int counter;
    public Dog(String location, HealthStates healthState) {
        this.location = location;
        this.HealthState = healthState;
        Dog.counter++;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public String toString() {
        return "Страна обитания: " + location + "\n" + "Состояние здоровья: " + HealthState + "\n" + "Количество собак: " + counter;
    }
}
