public class Task3 {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
