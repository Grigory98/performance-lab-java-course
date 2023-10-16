package org.example;

public abstract class Animal {
    public String name;
    public String food;
    public int foodCounter;
    public String location;
    public static int counter;

    public HealthStates HealthState;
    public enum HealthStates {
        HEALTHY,
        UNHEALTHY
    }

    public void makeSound() {
        System.out.println("Выводит текст, как звучит животное");
    }
    public void eat() {
        foodCounter--;
        System.out.println("Осталось " + foodCounter + " еды");
    }
    public void sleep() {
        System.out.println("Животное спит");
    }

    public String toString() {
        return "Страна обитания: " + location + "\n" + "Состояние здоровья: " + HealthState + "\n" + "Сколько особей: " + counter;
    }
}
