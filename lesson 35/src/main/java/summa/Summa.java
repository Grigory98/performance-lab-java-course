package summa;

public class Summa {
    int a,b,c;
    double x,y,z;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return sum(a, b) + c;
    }

    public static double sum(int a, double b, double c) {
        return a + sum(b, c);
    }

    public static double sum(Integer a, Integer b) {
        return a + b;
    }
}
