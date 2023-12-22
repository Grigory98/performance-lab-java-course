package Module5.Task1.baseElements;

import Module5.Task1.NatureElement;
import Module5.Task1.resultElements.Dust;
import Module5.Task1.resultElements.Energy;
import Module5.Task1.resultElements.Pressure;
import Module5.Task1.resultElements.Rain;

public class Air extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if(element instanceof Air) {
            System.out.println("Air + Air = Pressure");
            return new Pressure();
        } else if(element instanceof Earth) {
            System.out.println("Air + Earth = Dust");
            return new Dust();
        } else if(element instanceof Fire) {
            System.out.println("Air + Fire = Energy");
            return new Energy();
        } else if(element instanceof  Water) {
            System.out.println("Air + Water = Rain");
            return new Rain();
        }
        System.out.println("Нет нового элемента");
        throw new UnsupportedOperationException();
    }
}
