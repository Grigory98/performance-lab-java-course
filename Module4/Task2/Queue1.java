package Module4.Task2;

import java.util.ArrayList;
import java.util.List;

public class Queue1 implements Queue {

    public static List<Integer> nums = new ArrayList<>();

    @Override
    public void add(int value) {
        nums.add(value);
    }

    @Override
    public int remove() {
        int num = nums.get(0);
        nums.remove(0);
        return num;
    }

    @Override
    public boolean isEmpty() {
        return nums.isEmpty();
    }

    @Override
    public String toString() {
        return nums.toString().replace("[", "").replace("]", "");
    }
}
