package com.company;

public final class Bmw extends Car {
    private String driver;

    public Bmw(String driver,double value, int year, String marka,Color color){
        super(marka,value,year,color);
        this.driver = driver;
    }
    public String getDriver(){
        return driver;
    }
    public void makeVoice(String voice,int num){
        System.out.println("biib,biib");

    }
    public final String printInfo(){
        return super.printInfo();
    }


}
