class Calculator {
    private int operand1;
    private int operand2;
    private char operator;
    float result;

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public float calculate() {
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = (float) operand1 / operand2;
                }
                break;
            case '%':
                if (operand2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = (float) operand1 % operand2;
                }
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= Math.abs(operand2); i++) {
                    result *= operand1;
                }
                if (operand2 < 0) {
                    result = 1 / result;
                }
                break;
            default:
                System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
        }
        return result;
    }
}