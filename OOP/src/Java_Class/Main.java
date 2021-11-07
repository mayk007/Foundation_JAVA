package Java_Class;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        //Reference          o'zgaruvchi nomi       obyekt yaratish         Konstruktorga murojaat
//        Phone                telefon =                new                     Phone();
//
//        System.out.println(telefon.name);
//        System.out.println(telefon.model);
//        System.out.println(telefon.color);
//        System.out.println(telefon.speed);
//        telefon.Show();

        Car shessot = new Car("Shessot", "Mercedes", "black", 360, "lightWeight", 50.0, "automatic", 3.2f, 4, new Date(), "Oil");
        Car nexia = new Car("Nexia", "Chevrolet", "white", 220, "lightWeight", 30.0, "automatic", 3.0f, 4, new Date(), "Metan");
        Car lacetti = new Car("Lacetti", "Chevrolet", "Red", 360, "lightWeight", 40.0, "automatic", 4.2f, 4, new Date(), "Metan");
        Car bugatti = new Car("Bugatti", "Bugatti America", "Yellow", 360, "lightWeight", 100.0, "automatic", 3.6f, 4, new Date(), "Gazoil");
        shessot.show();
        nexia.show();
        lacetti.show();
        bugatti.show();
//        System.out.println(bugatti.name);
//        System.out.println(bugatti.model);
//        System.out.println(Car.wheelCount = 6);
//
//        System.out.println("/////////////////////////////////////////////");
//
//        System.out.println(nexia.name);
//        System.out.println(nexia.model);
        System.out.println(Car.wheelCount);
        Car.harakatlantirish();
    }
}
