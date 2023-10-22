import static java.lang.System.exit;

public class Task2 {
    public static void main(String[] args) {
        String path = String.join(" ", args);

        if(path.charAt(path.length() - 1) == '\\'
                || path.charAt(path.length() - 1) == '/' ||
                (path.length() == 1 && path.charAt(0) == '/') || (path.length() == 1 && path.charAt(0) == '\\')) {
            System.out.println("Введен некорректный путь до файла.");
            exit(0);
        }

        if(path.contains("\\")) {
            String[] pth = path.split("\\\\");
            String fileName = pth[pth.length - 1];
            pth[pth.length - 1] = "";
            String pathToFile = String.join("\\", pth);

            System.out.println("Путь: " + pathToFile);
            System.out.println("Имя файла: " + fileName);
        } else if(path.contains("/")) {
            String[] pth = path.split("/");
            String fileName = pth[pth.length - 1];
            pth[pth.length - 1] = "";
            String pathToFile = String.join("/", pth);

            System.out.println("Путь: " + pathToFile);
            System.out.println("Имя файла: " + fileName);
        } else {
            System.out.println("Введен некорректный путь до файла.");
        }
    }
}
