package Task2;

import java.util.HashMap;
import java.util.Iterator;

public class Basket<T extends Plant> {
    public HashMap<T, String> items = new HashMap<>(5);
    public void addItem(T item) {
        items.put(item, item.getName());
    }

    public Iterator<? extends Plant> iterator() {
        return items.keySet().iterator();
    }
}
