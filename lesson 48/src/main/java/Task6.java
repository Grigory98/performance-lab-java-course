import java.lang.String;
import java.math.BigInteger;

class Task6 {
    public static void main(final String[] args) throws Exception {
        final String s = args[0];

        try {
            final BigInteger bi = new BigInteger(s);
            System.out.println(bi.intValue());
        } catch (Exception e) {
            System.err.println("Ошибка при преобразовании строки в число");
            throw e;
        }
    }

    private static int toInt(final String str) {
        if (str == null || str.length() == 0) return 0;

        int sign = 1, len = str.length();
        char first = str.charAt(0);

        if (first == '-') {
            sign = -1;
            --len;
        } else if (first == '+') {
            ++len;
        }

        BigInteger bi = new BigInteger(str.substring(len).trim());
        return sign * bi.intValue();
    }
}