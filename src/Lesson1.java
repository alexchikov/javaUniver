import java.util.Scanner;
public class Lesson1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        String operation = in.next();
        int secondNumber = in.nextInt();
        float result = switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "/" -> (float) firstNumber / (float) secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> 0;
        };

        System.out.printf("result = %.1f\n", result);
    }
}
