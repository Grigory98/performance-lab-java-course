import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        var a = new Task1();
        int[] arr = new int[20];
        a.fillArray(arr);
    }

    void fillArray(int[] a) {
        Random rand = new Random();

        for(int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-9, 9);
        }

        String prefix = "";
        for (int i = 0; i < a.length; i++) {
            System.out.print(prefix + a[i]);
            if(i == 0)
                prefix = " ";
        }
    }
}
