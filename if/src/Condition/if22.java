package Condition;

import java.util.Scanner;

public class if22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;

        System.out.print("x= ");
        x = sc.nextInt();
        System.out.print("y= ");
        y = sc.nextInt();

        if (x > 0 && y > 0){
            System.out.println("Nuqta 1-chorakda yotadi.");
        } else if (x < 0 & y > 0){
            System.out.println("Nuqta 2-chorakda yotadi.");
        } else if (x < 0 && y < 0 ){
            System.out.println("Nuqta 3-chorakda yotadi.");
        } else {
            System.out.println("Nuqta 4-chorakda yotadi.");
        }

    }
}
