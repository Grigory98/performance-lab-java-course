import static java.lang.System.exit;

public class Task5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        if (a < 0 || b < 0 || c < 0 || d < 0) {
            System.out.println("Ошибка. Введены некорректные значения.");
            exit(1);
        }

        double price = Double.parseDouble(a + "." + b);
        double pay = Double.parseDouble(c + "." + d);
        double result = pay - price;

        String resultStr = Double.toString(result);
        String rub = resultStr.split("\\.")[0];
        String kop = resultStr.split("\\.")[1];

        if(result >= 0) {
            System.out.println("Уплаченной суммы хватает для оплаты товара.");
            System.out.println("Сдача составляет: " + rub + " рублей " + kop + " копеек.");
        } else {
            System.out.println("Ошибка. Суммы не хватает для оплаты товара.");
            exit(1);
        }
    }
}
