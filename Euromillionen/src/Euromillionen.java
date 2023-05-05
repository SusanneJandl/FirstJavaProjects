/*
 * Uebung 02
 * Euromillionen
 * Author: Susanne Jandl
 * Last change: 2023-03-19
 */

import java.util.*;

public class Euromillionen {

    // shuffles whole selection, creates and returns new TreeSet(printTipp)
        public static TreeSet<Integer> createOutput(List<Integer> selection, int digits) {
        Collections.shuffle(selection);
        TreeSet<Integer> printTipp = new TreeSet<>();
        for (int i = 0; i < digits; i++) {
            printTipp.add(selection.get(i));
        }
        return printTipp;
    }

    public static void main(String[] args) {

        ArrayList<Long> numbers = new ArrayList<>();       // declaration of List (digits of ctm)
        Long sum = 0L;                                     // declaration of sum (digits of ctm)
        long ctm = System.currentTimeMillis();             // current time in ms
        System.out.println("Current time in ms: " + ctm);

        for (int i = 0; ctm > 0; i++) {
            Long nextNumber = ctm % 10;                    // next number is last (least significant) position of ctm
            numbers.add(i, nextNumber);                    // add nextNumber to ArrayList
            ctm /= 10;                                     // new ctm is old ctm without last (least significant) position
        }

        System.out.print("Single digits of current time: ");
        System.out.print(numbers);

        for (Long number : numbers) {                       // sum up all digits of ArrayList numbers
            sum += number;
        }
        System.out.printf("\nSum of all digits: %d\n", sum);

        ArrayList<Integer> selMain = new ArrayList<>();    // ArrayList including all numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
            selMain.add(i);
        }
        ArrayList<Integer> selStar = new ArrayList<>();    // ArrayList including all numbers from 1 to 12
        for (int i = 1; i <= 12; i++) {
            selStar.add(i);
        }

        for (int i = 1; i <= sum; i++) {                   // prints output
            System.out.printf("Tipp %d: # %s * %s%n", i, createOutput(selMain, 5), createOutput(selStar, 2));
        }
    }
}
