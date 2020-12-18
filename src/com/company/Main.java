package com.company;

public class Main {

    public static void main(String[] args) {

         Car car1 = new Car("X5",4.5,2019,Color.GREEN);
         Car car2 = new Car ("X6", 5.7,2020,Color.BLACK);
         car1.makeVoice("boom,boom",3);
         car2.makeVoice("rrrrrrrr",2);

        System.out.println(car1.printInfo());
        Bmw bmw1 = new Bmw("man",5.1,2019, "P6",Color.WHITE);
        bmw1.makeVoice("baab,baab");
        System.out.println(bmw1.printInfo());
        Bmw bmw2 = new Bmw("girl",1.2, 2009,"X4",Color.RED);
        bmw2.makeVoice("la,la");
        System.out.println(bmw2.printInfo());

    }
}
