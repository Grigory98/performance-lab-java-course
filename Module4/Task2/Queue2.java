package Module4.Task2;

import java.util.ArrayList;
import java.util.List;

public class Queue2 implements Queue {

    public static List<Integer> nums = new ArrayList<>();
    @Override
    public void add(int value) {
        nums.add(0, value);
    }

    @Override
    public int remove() {
        int num = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
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
