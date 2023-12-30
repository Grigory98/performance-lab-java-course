package Task2;

import Task2.Vegetables.Cucumber;
import Task2.Vegetables.Tomato;

public class Main {
    public static void main(String[] args) {
        Cucumber cucumber = new Cucumber();
        Tomato tomato = new Tomato();

        VegetableBasket basket = new VegetableBasket()
                .addItem(cucumber, 1)
                .addItem(cucumber, 2)
                .addItem(cucumber, 3)
                .addItem(tomato, 4)
                .addItem(tomato, 5);

        System.out.println("Размер корзины: " + basket.size());
    }
}
