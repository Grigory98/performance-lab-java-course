public class Task2 {
    public static void main(String[] args) {
        int a = 4, b = 5;

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
