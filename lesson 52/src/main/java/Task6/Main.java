package Task6;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for(int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(arr);
        System.out.println(dynamicArray.toString());
        DynamicArray dynamicArray1 = new DynamicArray();
        dynamicArray1.add(dynamicArray.get());
        dynamicArray1.delete(1);
        System.out.println(dynamicArray.toString());
        System.out.println(dynamicArray1.toString());
    }
}
