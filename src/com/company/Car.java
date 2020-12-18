package com.company;

public class Car extends Transport {
    private String marka;
    private  Color color;

    public Car (String marka, double value, int year,Color color){
        super(value,year);
        this.marka = marka;
        this.color = color;

    }
    public String getMarka(){
        return marka;
    }
    public final void makeVoice(String voice){
        System.out.println(voice);
    }

    public  void makeVoice(String voice,int num){
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }

    }
    public String printInfo(){
      return("value: " + super.getValue() + " , year: " +super.getYear() + " , color: "+color + " , marka: "+ this.getMarka());
    }
}
