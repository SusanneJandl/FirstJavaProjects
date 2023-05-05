/*
 * CalculatorSys
 * child/extension of Calculator
 * using console/scanner for input
 * Author: Susanne Jandl
 * Last change: 2023-03-10
 */

import java.io.IOException;
import java.util.Scanner;

public class CalculatorSys extends Calculator {

    // prints String, uses checkDouble method of parent class to read and check input
    // repeats until input is a non-negative double and returns it
    // catches NumberFormatException of checkDouble method from parent class as well as new thrown NumberFormatException
    public static double checkInputNo(Scanner scanner, String error, String string) {
        double value = -1;
        do {
            System.out.print(string);
            try {
                value = checkDouble(scanner.nextLine());
                if (value < 0)
                    throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        } while (value < 0);
        return value;
    }

    // prints String, uses checkOperator method of parent class to read and check input
    // repeats until input is a valid operator and returns it
    // catches IOException of checkOperator method from parent class
    public static String checkInputOp(Scanner scanner, String error, String string) {
        String operator = "";
        do {
            System.out.print(string);
            try {
                operator = checkOperator(scanner.nextLine());
            } catch (IOException e) {
                System.out.println(error);
            }
        } while (operator.equals(""));
        return operator;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String errorValue = "Please enter a non-negative valid double!";
        String errorOperator = "Please enter a valid operator - allowed operators: +,-,*,/";
        double value1 = checkInputNo(scanner, errorValue, "Value 1: ");
        String operator = checkInputOp(scanner, errorOperator, "Operator: ");
        double value2 = checkInputNo(scanner, errorValue, "Value 2: ");
        double result = computeResult(value1, value2, operator);
        printOutput(value1, operator,value2, result);
    }
}
