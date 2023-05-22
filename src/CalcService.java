import java.io.IOException;

public class CalcService {
    Calculator calc = new Calculator();
    Sign s = new Sign();
    public String output(String expression) throws IOException {
        String output = "";
        char sign = s.getSign(expression);
        String[] arrayExpression = expression.split("\"");
        if (arrayExpression.length == 4) {
            String str01 = arrayExpression[1];
            String str02 = arrayExpression[3];
            if ((str01.length()>10) || (str02.length()>10)) {
                throw new IOException("введённое выражение не удовлетворяет задание");
            }
            output = calc.calculator(str01, str02, sign);
        } else if (arrayExpression.length == 3) {
            String str01 = arrayExpression[1];
            String str02 = arrayExpression[2];
            if (str01.length()>10) {
                throw new IOException("введённое выражение не удовлетворяет задание");
            }
            String[] arrayStr02 = str02.split(" ");
            int num = 0;
            try {
                num = Integer.parseInt(arrayStr02[2]);
            } catch (NumberFormatException e) {
                throw new IOException("введённое выражение не удовлетворяет задание");
            }
            if ((num<1) || (num>10)) {
                throw new IOException("введённое выражение не удовлетворяет задание");
            }
            output = calc.calculator(str01, num, sign);
        } else {
            throw new IOException("введённое выражение не удовлетворяет задание");
        }
        return output;
    }
}