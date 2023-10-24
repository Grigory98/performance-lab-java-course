import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        var tsk = new Task3();
        var a = tsk.fillArray(arr);
        System.out.println();
        tsk.bubbleSort(a);
    }

    void bubbleSort(int[] a) {
        int n = a.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }

        String prefix = "";
        for (int i = 0; i < a.length; i++) {
            System.out.print(prefix + a[i]);
            if(i == 0)
                prefix = " ";
        }
    }

    int[] fillArray(int[] a) {
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
        return a;
    }
}
