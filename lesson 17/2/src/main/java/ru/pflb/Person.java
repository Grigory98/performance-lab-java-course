package ru.pflb;

public abstract class Person {
    public int age;
    public String name;

    public String toString() {
        return "ФИО: " + name + "\n" + "Возраст: " + age;
    }
}
