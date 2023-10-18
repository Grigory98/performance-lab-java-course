package animal2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Animal.planet);
        Animal.planet = "Луна";
        var cat = new Cat();
        System.out.println(cat.planet);
    }
}
