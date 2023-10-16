package org.example;

public class Cat extends Animal {

    public static int counter;

    public Cat(String location, HealthStates healthState) {
        this.location = location;
        this.HealthState = healthState;
        Cat.counter++;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    @Override
    public String toString() {
        return "Страна обитания: " + location + "\n" + "Состояние здоровья: " + HealthState + "\n" + "Количество кошек: " + counter;
    }
}
