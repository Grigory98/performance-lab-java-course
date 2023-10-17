public class Task4 {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        double r = Double.parseDouble(args[1]);
        int t = Integer.parseInt(args[2]);

        System.out.println(p * Math.exp(r * t));
    }
}
