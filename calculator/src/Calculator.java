/*
 * Calculator
 * parent class of CalculatorArgs and CalculatorSys
 * includes general methods for extension/child classes
 * Author: Susanne Jandl
 * Last change: 2023-03-10
 */

import java.io.IOException;

public class Calculator {

    // computes result of two double values, operator has to be a String
    public static double computeResult(double value1, double value2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                result = value1 / value2;
                break;
        }
        return result;
    }

    // returns double, if input was correct
    // NumberFormatException must be handled, when method is used
    public static double checkDouble(String input) throws NumberFormatException {
        return Double.parseDouble(input);
    }

    // returns needed operators if input was correct
    // returns empty String if input was incorrect
    // IOException must be handled, when method is used
    public static String checkOperator(String input) throws IOException {
        String output = "";
        if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/"))
            output = input;
        else throw new IOException();
        return output;
    }

    // prints calculation output, if no division by zero
    // prints Error message, if division by zero
    // decimal places can be adapted here: %.<numberOfDecimalPlaces>f
    public static void printOutput(double value1, String operator, double value2, double result) {
        if (value2 == 0 && operator.equals("/"))
            System.out.println("Error - division by zero is not allowed, try again!");
        else
            System.out.printf("%.2f %s %.2f = %.3f%n", value1, operator, value2, result);
    }
}
