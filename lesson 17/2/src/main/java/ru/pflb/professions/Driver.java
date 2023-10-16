package ru.pflb.professions;

import ru.pflb.Person;

public class Driver extends Person {
    public Driver(String name, int age, int drivingExperience, int licenseId) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }
    public int drivingExperience;
    public int licenseId;

    @Override
    public String toString() {
        return "Возраст: " + this.age + "\n" + "Стаж: " + this.drivingExperience + "\n" + "№ удостоверения: " + this.licenseId;
    }
}
