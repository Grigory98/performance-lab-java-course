package Module4.Task2;

public class Main {
    public static void main(String[] args) {

        Queue1 queue1 = new Queue1();
        Queue2 queue2 = new Queue2();

        System.out.println("Очередь #1:");
        for (String arg : args) {
            queue1.add(Integer.parseInt(arg));
        }
        System.out.println("Добавленные элементы: " + queue1.toString());
        while(!queue1.isEmpty()) {
            System.out.println("Удален элемент " + queue1.remove() + ", оставшиеся элементы " + queue1.toString());
        }

        System.out.println("Очередь #2:");
        for (String arg : args) {
            queue2.add(Integer.parseInt(arg));
        }
        System.out.println("Добавленные элементы: " + queue2.toString());
        while(!queue2.isEmpty()) {
            System.out.println("Удален элемент " + queue2.remove() + ", оставшиеся элементы " + queue2.toString());
        }
    }
}
