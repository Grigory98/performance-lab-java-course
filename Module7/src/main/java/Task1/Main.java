package Task1;

import Task1.Fruits.Apple;
import Task1.Fruits.Banana;
import Task1.Vegetables.Cucumber;
import Task1.Vegetables.Tomato;

public class Main {
    public static void main(String[] args) {
        Tomato tomato = new Tomato();
        Cucumber cucumber = new Cucumber();
        Apple apple = new Apple();
        Banana banana = new Banana();

        Basket<Vegetable> basketVegetables = new Basket<Vegetable>();
        Basket<Fruit> basketFruit = new Basket<Fruit>();

        basketVegetables.addItem(tomato);
        basketVegetables.addItem(cucumber);

        basketFruit.addItem(apple);
        basketFruit.addItem(banana);

        System.out.println(basketVegetables.items);
        System.out.println(basketFruit.items);
    }
}
