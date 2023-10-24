import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[][] a = new int[5][];
        Task5 tsk = new Task5();
        Random randNum = new Random();
        for(int i = 0; i < a.length; i++) {
            a[i] = new int[randNum.nextInt(1, 7)];
            a[i] = tsk.fillArray(a[i]);
        }

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    int[] fillArray(int[] a) {
        Random rand = new Random();
        for(int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-9, 9);
        }

        return a;
    }
}
