/*
 * PRO2, Exercise 5
 * Math Game, Calculation
 * Author: Susanne Jandl
 * Last change: 2023-04-10
 */

import java.util.*;


public class Calculation {

    private int no1;
    private int no2;
    private static String operators = "+-*/";
    private char operator;

    private float result;

    // constructor (all parameters are set in constructor)
    public Calculation() {
        int no = 0;
        this.no1 = defineNo();
        Random rand = new Random();
        int i = rand.nextInt(0, 4);
        this.operator = operators.charAt(i);
        if (this.operator == '/') {
            while (no == 0)
                no = defineNo();
            this.no2 = no;
        } else this.no2 = defineNo();
        switch (operator) {
            case '+':
                this.result = no1 + no2;
                break;
            case '-':
                this.result = no1 - no2;
                break;
            case '*':
                this.result = no1 * no2;
                break;
            case '/':
                this.result = no1 * 1.0f / no2;
                break;
        }
    }

    // getter result (set in constructor)
    public float getResult() {
        return result;
    }

    // method to get a random number (used in constructor)
    public int defineNo() {
        Random rand = new Random();
        return rand.nextInt(-100,501);
    }

    // method to get the calculation as String (used in Application)
    public String stringCalculation() {
        return no1 + " " + operator + " " + no2 + " = ";
    }
}
