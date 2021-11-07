package Java_Class;

import java.util.Date;

public class Car {
    static  int wheelCount= 4;
    String name;
    String model;
    String color;
    int    speedMax;
    String type;
    double price;
    String lead;
    float  weight;
    int   passegerCount;
    Date  year;
    String engineType;

//    public Car(String name, String model, String color, int speedMax, String type, double price, String lead, float  weight, int  passegerCount, Date  year, String engineType){
//        this.name = name;
//        this.model = model;
//        this.color = color;
//        this.speedMax = speedMax;
//    }
//    static {
//    wheelCount = 4;
//    }

    public Car(String name, String model, String color, int speedMax, String type, double price, String lead, float weight, int passegerCount, Date year, String engineType) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.speedMax = speedMax;
        this.type = type;
        this.price = price;
        this.lead = lead;
        this.weight = weight;
        this.passegerCount = passegerCount;
        this.year = year;
        this.engineType = engineType;
    }

    public Car(){

    }

    public static void harakatlantirish(){
        System.out.println("Start engine!");
    }

    public void holati(){
        System.out.println(name + "  katta yo'lda ketyapti!");
    }

    public void show(){
        System.out.println("name: " + name);
        System.out.println("model: " + model);
        System.out.println("color: " + color);
        System.out.println("speedMax: " + speedMax);
        System.out.println("type: " + type);
        System.out.println("price: " + price);
        System.out.println("lead: " + lead);
        System.out.println("weight: " + weight);
        System.out.println("passegerCount: " + passegerCount);
        System.out.println("year: " + year);
        System.out.println("engineType: " + engineType);
        System.out.println("wheelCount:  " + wheelCount);
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
    }

}
