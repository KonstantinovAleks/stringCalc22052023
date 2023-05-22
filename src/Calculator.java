import java.io.IOException;

public class Calculator {
    public String calculator(String str01, String str02, char sign) throws IOException {
        String result = "";
        switch (sign) {
            case '+':
                result = str01.concat(str02);
                break;
            case '-':
                if (str01.contains(str02)) {
                    result = str01.replace(str02, "");
                } else {
                    result = str01;
                }
                break;
            case '*':
            case '/':
                throw new IOException("введённое выражение не удовлетворяет задание");
        }
        return result;
    }
    public String calculator(String str01, int num, char sign) throws IOException {
        String result = "";
        switch (sign) {
            case '+':
            case '-':
                throw new IOException("введённое выражение не удовлетворяет задание");
            case '*':
                for (int i = 0; i<num; i++) {
                    result = result + str01;
                }
                if (result.length()>40) {
                    result = result.subSequence(0, 40) + "...";
                }
                break;
            case '/':
                int endIndex = str01.length() / num;
                result = str01.substring(0, endIndex);
                break;
        }
        return result;
    }
}