package cat;

public class Main {
    public static void main(String[] args) {
        var cat1 = new Cat();
        var cat2 = new Cat(10);
        var cat3 = new Cat("Yellow");
        var cat4 = new Cat("Blue", "Gray");
        var cat5 = new Cat(8, "Green", "White");

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());
        System.out.println(cat4.toString());
        System.out.println(cat5.toString());
    }
}
