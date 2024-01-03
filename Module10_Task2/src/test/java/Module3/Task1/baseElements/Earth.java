package Module3.Task1.baseElements;

import Module3.Task1.NatureElement;
import Module3.Task1.resultElements.Dust;
import Module3.Task1.resultElements.Lava;
import Module3.Task1.resultElements.Mud;
import Module3.Task1.resultElements.Pressure;

public class Earth extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if(element instanceof Earth) {
            System.out.println("Earth + Earth = Pressure");
            return new Pressure();
        } else if(element instanceof Air) {
            System.out.println("Earth + Air = Dust");
            return new Dust();
        } else if(element instanceof Fire) {
            System.out.println("Earth + Fire = Lava");
            return new Lava();
        } else if(element instanceof  Water) {
            System.out.println("Earth + Water = Mud");
            return new Mud();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
