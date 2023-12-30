package Task2;

import java.util.HashMap;

public class VegetableBasket {
    private final HashMap<Vegetable, Integer> vegetables;

    public VegetableBasket() {
        this.vegetables = new HashMap<>();
    }

    public VegetableBasket addItem(Vegetable vegetable, int index) {
        vegetables.put(vegetable, index);
        return this;
    }

    public int size() {
        return vegetables.size();
    }
}