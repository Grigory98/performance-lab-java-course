package Task2;

import Task2.Fruits.Apple;
import Task2.Fruits.Banana;
import Task2.Vegetables.Cucumber;
import Task2.Vegetables.Tomato;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Tomato tomato = new Tomato();
        Cucumber cucumber = new Cucumber();
        Apple apple = new Apple();
        Banana banana = new Banana();

        Basket<Vegetable> basketVegetables = new Basket<>();
        Basket<Fruit> basketFruit = new Basket<>();

        basketFruit.addItem(apple);
        basketFruit.addItem(banana);
        basketVegetables.addItem(tomato);
        basketVegetables.addItem(cucumber);

        makeSalad(basketFruit);
        makeSalad(basketVegetables);
    }

    static void makeSalad(Basket<? extends Plant> basket) {
        System.out.println("Готовим салатик:");
        Iterator<? extends Plant> i = basket.iterator();
        while (i.hasNext()) {
            System.out.println("Режем - " + i.next().getName());
        }
        System.out.println("Угощайся!");
    }
}
