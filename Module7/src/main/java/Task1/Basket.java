package Task1;

import java.util.ArrayList;

public class Basket<T> {
    public ArrayList<T> items = new ArrayList<>(5);
    public void addItem(T item) {
        items.add(item);
    }
}
