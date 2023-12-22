package Module5.Task1.baseElements;

import Module5.Task1.NatureElement;
import Module5.Task1.resultElements.*;

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
        } else if(element instanceof Energy) {
            System.out.println("Water + Energy = Steam");
            return new Steam();
        }
        System.out.println("Нет нового элемента");
        throw new UnsupportedOperationException();
    }
}
