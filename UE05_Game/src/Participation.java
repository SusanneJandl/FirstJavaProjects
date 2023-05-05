/*
 * PRO2, Exercise 5
 * Math Game, Participation
 * Author: Susanne Jandl
 * Last change: 2023-04-10
 */

import java.util.*;

public class Participation {
    private boolean correct = false;
    private float input;
    private long startTime;
    private long endTime;

    private static float timeSum = 0;

    // constructor (sets startTime)
    public Participation() {
        this.startTime = System.currentTimeMillis();
    }

    // setter input (checks and sets input from console)
    public void setInput(Scanner scanner, String stringCalculation) {
        try {
            input = Float.parseFloat(scanner.nextLine());
            endTime = System.currentTimeMillis();
        } catch (NumberFormatException e) {
            System.out.print("Please enter a valid result!\nResult of: " + stringCalculation);
            setInput(scanner, stringCalculation);
        }
    }

    // getter (input)
    public float getInput() {
        return input;
    }

    // setter (correct)
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    // getter (correct)
    public boolean getCorrect() {
        return correct;
    }

    // METHODS:
    // getter for static variable timeSum
    public static float getTimeSum() {
        return timeSum;
    }

    // method to calculate time needed for a calculation
    public float calculateTime() {
        float calculatedTime = ((this.endTime) - this.startTime) / 1000.0f;
        timeSum += calculatedTime;
        return calculatedTime;
    }
}
