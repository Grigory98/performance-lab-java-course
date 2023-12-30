package Task1;

import Task1.Fruits.Apple;
import Task1.Fruits.Banana;
import Task1.Vegetables.Cucumber;
import Task1.Vegetables.Tomato;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Plant> plants = Arrays.asList(
                new Apple(),
                new Banana(),
                new Cucumber(),
                new Tomato()
        );

        List<Fruit> multifruit = plants.stream()
                .filter(p -> p instanceof Fruit)
                .map(f -> (Fruit) f)
                .collect(Collectors.toList());

        System.out.println(multifruit);
    }
}
