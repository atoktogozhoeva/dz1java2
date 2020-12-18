package com.company;

public class Transport {
    private double value;
    private int year;

    public Transport(double value, int year) {
        this.value = value;
        this.year = year;


    }

    public int getYear() {
        return year;
    }
    public double getValue(){
        return value;
    }
}
