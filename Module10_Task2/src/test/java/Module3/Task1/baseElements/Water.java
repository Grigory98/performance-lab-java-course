package Module3.Task1.baseElements;

import Module3.Task1.NatureElement;
import Module3.Task1.resultElements.Mud;
import Module3.Task1.resultElements.Rain;
import Module3.Task1.resultElements.Sea;
import Module3.Task1.resultElements.Steam;

public class Water extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if(element instanceof Water) {
            System.out.println("Water + Water = Sea");
            return new Sea();
        } else if(element instanceof Fire) {
            System.out.println("Water + Fire = Steam");
            return new Steam();
        } else if(element instanceof Earth) {
            System.out.println("Water + Earth = Mud");
            return new Mud();
        } else if(element instanceof Air) {
            System.out.println("Water + Air = Rain");
            return new Rain();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
