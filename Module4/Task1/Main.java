package Module4.Task1;

public class Main {
    public static void main(String[] args) {
        Object obj = null;
        if(!args[0].chars().allMatch(Character::isAlphabetic)) {
            System.out.println("Не передано название операции.");
            return;
        } else if (args.length <= 1) {
            System.out.println("Не переданы числа для операции.");
            return;
        }
        try {
            obj = Class.forName("Module4.Task1." + args[0]).newInstance();
        } catch(Exception e) {
            System.out.println("Операция "+ args[0] +" не поддерживается.");
            e.printStackTrace();
            return;
        }

        int[] results = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            results[i - 1] = Integer.parseInt(args[i]);
        }

        var test = applyFunction(results, (Function) obj);
        System.out.println("Вывод: ");
        for(int i = 1; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }

    static int[] applyFunction(int[] nums, Function funcObj) {
        int[] results = new int[nums.length];
        if(funcObj instanceof Half half) {
            for (int i = 0; i < nums.length; i++) {
                results[i] = half.evaluate(nums[i]);
            }
            return results;
        } else if(funcObj instanceof Double doub) {
            for (int i = 0; i < nums.length; i++) {
                results[i] = doub.evaluate(nums[i]);
            }
            return results;
        } else if(funcObj instanceof  Exact exact) {
            for (int i = 0; i < nums.length; i++) {
                results[i] = exact.evaluate(nums[i]);
            }
            return results;
        } else if(funcObj instanceof Square square) {
            for (int i = 0; i < nums.length; i++) {
                results[i] = square.evaluate(nums[i]);
            }
            return results;
        }
        return null;
    }
}
