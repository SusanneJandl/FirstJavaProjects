/*
 * CalculatorArgs
 * child/extension of Calculator
 * using args for input
 * Author: Susanne Jandl
 * Last change: 2023-03-10
 */

import java.io.IOException;

public class CalculatorArg extends Calculator {
    public static void main(String[] args) {
        String error = "Error - arguments must be of type NUMBER1 {'*'|'/'|'+'|'-'} NUMBER2";
        if (args.length == 3) {
            try {
                double value1 = checkDouble(args[0]);
                double value2 = checkDouble(args[2]);
                String operator = checkOperator(args[1]);
                double result = computeResult(value1, value2, operator);
                printOutput(value1, operator, value2, result);
            } catch (IOException | NumberFormatException e) {
                System.out.println(error);
            }
        } else
            System.out.println(error);
    }
}
