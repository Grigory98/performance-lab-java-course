public class Task5 {
    public static void main(String[] args) {


        System.out.println("Входная строка: " + args[0]);
        if(isInteger(args[0]))
            System.out.println("Вывод: Строка является целым числом");
        else
            System.out.println("Вывод: Строка не является целым числом");


    }

    public static boolean isInteger(String str) {
        for(int i = 0; i < str.length(); i++)
            if(Character.isLetter(str.charAt(i)))
                return false;
        return  true;
    }
}
