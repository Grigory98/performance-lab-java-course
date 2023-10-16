package org.example;

public class Vet {
    public String name;

    public void treatAnimal(Animal animal) {
        System.out.println("Осуществляет прием у ветеринара, вылечивает здоровье животного");
        animal.HealthState = Animal.HealthStates.HEALTHY;
    }
}
