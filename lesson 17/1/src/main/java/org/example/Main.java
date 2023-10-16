package org.example;

public class Main {
    public static void main(String[] args) {
        var dog = new Dog("USA", Animal.HealthStates.UNHEALTHY);
        var cat = new Cat("Russia", Animal.HealthStates.HEALTHY);
        var horse = new Horse("China", Animal.HealthStates.UNHEALTHY);

        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(horse.toString());

        dog.makeSound();
        cat.makeSound();
        horse.makeSound();

        dog.eat();
        cat.eat();
        horse.eat();

        var vet = new Vet();
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);

        dog.sleep();
        cat.sleep();
        horse.sleep();
    }
}
