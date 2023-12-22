package Module5.Task1;

import Module5.Task1.baseElements.Air;
import Module5.Task1.baseElements.Earth;
import Module5.Task1.baseElements.Fire;
import Module5.Task1.baseElements.Water;
import Module5.Task1.resultElements.Energy;

import java.util.NoSuchElementException;

public class NatureElement {

    public NatureElement connect(NatureElement element) {
        throw new UnsupportedOperationException();
    }

    public static NatureElement create(String name) throws NoSuchElementException {
        switch(name) {
            case "Air":
                return new Air();
            case "Earth":
                return new Earth();
            case "Fire":
                return new Fire();
            case "Water":
                return new Water();
            case "Energy":
                return new Energy();
            default:
                System.out.println("Неизвестный элемент.");
                throw new NoSuchElementException();
        }
    }
}
