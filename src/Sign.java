import java.io.IOException;

public class Sign {
    public char getSign(String expression) throws IOException{
        char sign = '0';
        if (expression.contains(" + ")) {
            sign = '+';
        } else if (expression.contains(" - ")) {
            sign = '-';
        } else if (expression.contains(" * ")) {
            sign = '*';
        } else if (expression.contains(" / ")) {
            sign = '/';
        } else {
            throw new IOException("введён знак не удовдетвлряет задание");
        }
        return sign;
    }
}