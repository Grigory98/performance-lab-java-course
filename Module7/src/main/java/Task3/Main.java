package Task3;

import Task2.Fruits.Apple;
import Task2.Fruits.Banana;
import Task2.Vegetables.Cucumber;
import Task2.Vegetables.Tomato;
import Task2.Plant;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        HashMap<String, Plant> hashMapPlants = new HashMap<>();

        Banana banana = new Banana();
        Apple apple = new Apple();
        Cucumber cucumber = new Cucumber();
        Tomato tomato = new Tomato();

        plants.add(banana);
        plants.add(apple);
        plants.add(cucumber);
        plants.add(tomato);

        for (Plant plant : plants) {
            hashMapPlants.put(plant.getName(), plant);
        }

        hashMapPlants.forEach((key, value) -> System.out.println(key + " " + value.getClass()));
    }
}
