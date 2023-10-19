public class Task4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isRight  = Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) && (a + b > c && a + c > b && b + c > a);
        boolean isAcute  = Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2) && (a + b > c && a + c > b && b + c > a);
        boolean isObtuse = Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2) && (a + b > c && a + c > b && b + c > a);

        if(isRight)
            System.out.println("right");
        else if(isAcute)
            System.out.println("acute");
        else if(isObtuse)
            System.out.println("obtuse");
        else
            System.out.println("impossible");
    }
}
