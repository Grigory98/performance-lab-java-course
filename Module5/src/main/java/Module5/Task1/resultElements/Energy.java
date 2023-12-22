package Module5.Task1.resultElements;

import Module5.Task1.NatureElement;
import Module5.Task1.baseElements.Water;

public class Energy extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if(element instanceof Water) {
            System.out.println("Energy + Water = Steam");
            return new Steam();
        }
        throw new UnsupportedOperationException();
    }
}
