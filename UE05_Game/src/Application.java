/*
 * PRO2, Exercise 5
 * Math Game, Application
 * Author: Susanne Jandl
 * Last change: 2023-04-10
 */

import java.util.*;

public class Application {

    // method to round a float number and choose number of decimal places
    public static float roundX(float number, int decimalPlaces) {
        return Math.round(number*(Math.pow(10, decimalPlaces))/Math.pow(10, decimalPlaces));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Participation> participation = new ArrayList<>();
        ArrayList<Calculation> calculations = new ArrayList<>();
        boolean allCorrect = true;
        int exercises = 7;

        // combine calculation and participation, store values in arrays declared above
        for (int i = 0; i < exercises; i++) {
            Calculation calculate = new Calculation();
            Participation participate = new Participation();
            System.out.print("Please enter the result of: " + calculate.stringCalculation());
            participate.setInput(scanner, calculate.stringCalculation());
            if (roundX(participate.getInput(), 2) == roundX(calculate.getResult(), 2))
                participate.setCorrect(true);
            participation.add(i, participate);
            calculations.add(i, calculate);
        }

        System.out.println();

        // print summary of calculations
        for (int i = 0; i < exercises; i++) {
            System.out.printf(Locale.US, "Calculation %d:%n  %s %.2f%n", i + 1, calculations.get(i).stringCalculation(), calculations.get(i).getResult());
            System.out.printf("  Correct: %b%n  Time needed: %.2f sec%n%n", participation.get(i).getCorrect(), participation.get(i).calculateTime());
        }

        System.out.printf("Average time needed: %.2f sec%n", Participation.getTimeSum() / exercises);

        for (int i = 0; i < exercises; i++) {
            if (!participation.get(i).getCorrect()) {
                allCorrect = false;
                break;
            }
        }

        if (allCorrect)
            System.out.println("Congratulations - you answered all questions correctly!");
    }
}
