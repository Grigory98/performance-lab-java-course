import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        if(args.length == 0)
            return;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < args.length; i++) {
            result.append(args[i] + " ");
        }
        System.out.println(result);
        result.delete(0, result.length());

        var test = Arrays.stream(args).distinct().toArray();
        for(int i = 0; i < test.length; i++)
            result.append(args[i] + " ");

        System.out.println(result);
    }
}
