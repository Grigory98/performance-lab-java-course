import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        var tsk4 = new Task4();
        int[] arr = new int[21];
        arr = tsk4.fillArray(arr);
        Arrays.sort(arr);
        System.out.print("Создан массив: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Медиана: " + tsk4.median(arr));
        System.out.print("Повторный ввод исходного массива: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    float median(int[] a) {
        int res;
        if(a.length % 2 == 0) {
            res = a[a.length/2];
        } else {
            int num = a.length/2;
            res = (a[num] + a[num+1]) / 2;
        }
        return res;
    }

    int[] fillArray(int[] a) {
        Random rand = new Random();
        for(int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(0, a.length);
        }

        return a;
    }
}
