package Module3.Task1;

public class NatureElement {

    public NatureElement connect(NatureElement element) { return null; }

    public static NatureElement create(String name) {
        Object obj = null;
        try {
            obj = Class.forName("Module3.Task1.baseElements." + name).newInstance();
        } catch(Exception e) {
            System.out.println("Неизвестный элемент.");
            e.printStackTrace();
        }
        return (NatureElement) obj;
    }
}
