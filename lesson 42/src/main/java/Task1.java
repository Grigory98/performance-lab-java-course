class Task1 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int x = m;
        while(x <= n) {

            if(x%3 == 0 && x%5 != 0) {
                System.out.println(x);
            }

            x++;
        }
    }
}