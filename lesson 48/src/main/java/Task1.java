public class Task1 {
    public static String str = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {
        String sign = args[0];
        System.out.println("Через аргументы передается \""+sign+"\", Вывод: "+str.replace(" ", "").indexOf(sign)+".");
    }
}
