package animal;

public class Main {
    public static void main(String[] args) {
        Animal.testStaticMethod();
        new Animal().testStaticMethod();
        new Cat().testStaticMethod();
    }
}
