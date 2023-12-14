package Module3.Task1.baseElements;

import Module3.Task1.NatureElement;
import Module3.Task1.resultElements.Energy;
import Module3.Task1.resultElements.Lava;
import Module3.Task1.resultElements.Steam;

public class Fire extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if(element instanceof Fire) {
            System.out.println("Fire + Fire не производит новый элемент");
            return null;
        } else if(element instanceof Air) {
            System.out.println("Fire + Air = Energy");
            return new Energy();
        } else if(element instanceof Earth) {
            System.out.println("Fire + Earth = Lava");
            return new Lava();
        } else if(element instanceof  Water) {
            System.out.println("Fire + Water = Steam");
            return new Steam();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
