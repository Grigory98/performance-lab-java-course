public class Task4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(args[0]);

        for(int i = 0; i < sb.length(); i++) {
            if(!Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);

    }
}
