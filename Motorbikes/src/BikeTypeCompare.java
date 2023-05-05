/*
 * Project motorbikes
 * Application, main class
 * Author: Susanne Jandl
 * Last change: 2023-03-20
 */

import java.util.*;

class BikeTypeCompare implements Comparator<Bike> {

    public int compare(Bike b1, Bike b2) {
       return b1.getType().compareTo(b2.getType());
    }
}
