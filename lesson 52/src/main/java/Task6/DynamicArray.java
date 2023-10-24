package Task6;

public class DynamicArray {
    private int size;
    private int[]nums;

    public DynamicArray(int size) {
        this.size = size;
    }

    public DynamicArray(int... nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        String prefix = "";
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            result += prefix + nums[i];
            prefix = " ";
        }
        return result;
    }

    public void add(int x) {
        int[] newNums = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        newNums[nums.length + 1 ] = x;
        nums = newNums;
    }

    public void add(int[] x) {
        int[] newNums = new int[nums.length + x.length];
        for(int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        for(int i = 0; i < x.length; i++) {
            newNums[nums.length + i] = x[i];
        }
        nums = newNums;
    }

    public  int getAt(int n) {
        return nums[n];
    }

    int[] get() {
        return nums;
    }

    int[] get(int from, int to) {
        int[] newNums = new int[to - from];
        int count = 0;
        for (int i = from; i < nums[to]; i++) {
            newNums[count] = nums[i];
            count++;
        }
        return newNums;
    }

    void delete(int n) {
        int[] newNums = new int[nums.length - 1];
        System.arraycopy(nums, 0, newNums, 0, n);
        System.arraycopy(nums, n + 1, newNums, n, nums.length - n - 1);
        nums = newNums;
    }

    void deleteAll() {
        nums = new int[nums.length];
    }
}
