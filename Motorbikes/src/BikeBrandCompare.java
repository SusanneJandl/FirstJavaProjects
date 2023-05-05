/*
 * Project motorbikes
 * Application, main class
 * Author: Susanne Jandl
 * Last change: 2023-03-20
 */

import java.util.*;

class BikeBrandCompare implements Comparator<Bike>{

    public int compare(Bike b1, Bike b2) {
        return b1.getBrand().compareTo(b2.getBrand());
    }
}
