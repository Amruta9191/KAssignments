import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:-");
        int enteredNum1 = scanner.nextInt();
        System.out.println("Enter second number:-");
        int enteredNum2 = scanner.nextInt();
        System.out.println("Enter operator:-");
        String operator = scanner.next();
        calculate(enteredNum1, enteredNum2, operator);
    }

    static double calculate(int num1, int num2, String op) {
        double calculatedValue = 0;
        try {
            if (op.equals("+")) {
                calculatedValue = num1 + num2;
                System.out.println("" + calculatedValue);
            } else if (op.equals("-")) {
                calculatedValue = num1 - num2;
                System.out.println("" + calculatedValue);
            } else if (op.equals("*")) {
                calculatedValue = num1 * num2;
                System.out.println("" + calculatedValue);

            } else if (op.equals("/")) {
                if (num2 != 0) {
                    calculatedValue = num1 / num2;
                    System.out.println("" + calculatedValue);
                } else {
                    System.out.println("Cannot divide by zero");

                }
            }
        } catch (Exception e) {
            System.out.println("exception" + e.getMessage());
        }

        return calculatedValue;

    }
}
