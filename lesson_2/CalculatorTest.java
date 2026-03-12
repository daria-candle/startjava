import java.util.InputMismatchException;
import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        char operator = ' ';
        float result;
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            try {
                    System.out.print("Введите первое число: ");
                    operand1 = scanner.nextInt();
                    System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                    operator = scanner.next().charAt(0);
                    System.out.print("Введите второе число: ");
                    operand2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    scanner.nextLine(); 
            }
            Calculator calculator = new Calculator();
            calculator.setOperand1(operand1);
            calculator.setOperator(operator);
            calculator.setOperand2(operand2);
            result = calculator.getResult();
            System.out.printf("%d %c %d = %.4f\n", operand1, operator, operand2, result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") & !answer.equals("no"));
        } while (answer.equals("yes"));
        scanner.close();
    }
}