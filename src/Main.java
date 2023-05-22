import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Input:");
        Scanner reading = new Scanner(System.in);
        String expression = reading.nextLine();
        CalcService calc = new CalcService();
        System.out.println("Output:\n" + "\"" + calc.output(expression) + "\"");
    }
}