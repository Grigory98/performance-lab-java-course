package Module3.Task1;

public class Alchemy {
    public static void main(String[] args) {
        NatureElement elem1 = NatureElement.create(args[0]);
        NatureElement elem2 = NatureElement.create(args[1]);
        elem1.connect(elem2);

        NatureElement elem3 = NatureElement.create(args[2]);
        NatureElement elem4 = NatureElement.create(args[3]);
        elem3.connect(elem4);
    }
}
