package animal;

public class Cat extends Animal {
    public int age;
    public String eyesColor;
    public String bodyColor;


    public Cat() {
        this(1, "Green", "Black");
    }

    public Cat(int age) {
        this(age, "Green", "Black");
    }

    public Cat(String eyesColor) {
        this(1, eyesColor, "Black");
    }

    public Cat(String eyesColor, String bodyColor) {
        this(1, eyesColor, bodyColor);
    }
    public Cat(int age, String eyesColor, String bodyColor) {
        this.age = age;
        this.eyesColor = eyesColor;
        this.bodyColor = bodyColor;
    }

    @Override
    public String toString() {
        return "Количество лет: " + age + "\n" + "Цвет глаз: " + eyesColor + "\n" + "Цвет шерсти: " + bodyColor;
    }
}
