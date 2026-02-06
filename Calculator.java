import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        double result;
        char operator = ' ';
        Scanner in = new Scanner(System.in);
        boolean isCorrectResult = false;
        do {
            InputMismatchException exeption;
            try {
                System.out.print("Введите первый операнд (натур. число): ");
                operand1 = in.nextInt();
                System.out.print("Введите второй операнд (натур. число): ");
                operand2 = in.nextInt();
                System.out.print("Введите операцию (символ): ");
                operator = in.next().charAt(0);
                if (operand1 <= 0 | operand2 <=0) {
                    System.out.println("Введено не натуральное число. Повторите ввод");
                    isCorrectResult = false;
                } else {
                    isCorrectResult = true;
                }
            } catch (InputMismatchException e){
                System.out.println("Случилась ошибка: " + e.getMessage());
                System.out.println("Повторите ввод");
                
                // Очистить буфер ввода
                in.nextLine(); 
                isCorrectResult = false;
            }
        } while (!isCorrectResult);
        in.close();
        if (operator == '+') {
            result = operand1 + operand2;
        } else if (operator == '-') {
            result = operand1 - operand2;
        } else if (operator == '*') {
            result = operand1 * operand2;
        } else if (operator == '/') {
            result = operand1 / operand2;
        } else if (operator == '%') {
            result = operand1 % operand2;
        } else if (operator == '^') {
            result = operand1;
            for (int i = 2; i <= operand2; i++) {
                result = result * operand1;
            }
        } else {
            System.out.println("Введенный символ не является математическим оператором");
            return;
        }
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        System.out.printf("%d %c %d = %s", operand1, operator, operand2, format.format(result));
    }
}