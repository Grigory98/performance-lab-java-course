public class Task2 {
    public static void main(String[] args) {
        if(args.length == 0)
            System.err.println("Аргументы не переданы");

        int maxLetters = 0;
        String resultWord = "";
        for(int i = 0; i < args.length; i++) {
            int wordLen = args[i].length();
            if(wordLen >= maxLetters) {
                maxLetters = wordLen;
                resultWord = args[i];
            }
        }
        System.out.println(resultWord);
    }
}
