/*
 * Project motorbikes
 * bikes class
 * Author: Susanne Jandl
 * Last change: 2023-03-20
 */


public class Bike implements Comparable<Bike> {

    private String brand;
    private int horsePower;
    private String color;
    private int constructionYear;
    private BikeType type;

    public Bike(String brand, int horsePower, String color, int constructionYear, BikeType type) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.color = color;
        this.constructionYear = constructionYear;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public String getColor() {
        return this.color;
    }

    public int getConstructionYear() {
        return this.constructionYear;
    }

    public BikeType getType() {
        return this.type;
    }

    @Override
    public int compareTo(Bike o) {
        return this.constructionYear - o.constructionYear;
    }
}
