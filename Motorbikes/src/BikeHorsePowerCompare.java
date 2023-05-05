/*
 * Project motorbikes
 * Application, main class
 * Author: Susanne Jandl
 * Last change: 2023-03-21
 */

import java.util.*;

class BikeHorsePowerCompare implements Comparator<Bike> {

    public int compare(Bike b1, Bike b2) {
        if (b1.getHorsePower() < b2.getHorsePower()) {
            return 1;
        } else if (b1.getHorsePower() > b2.getHorsePower()) {
            return -1;
        } else return 0;
    }
}
