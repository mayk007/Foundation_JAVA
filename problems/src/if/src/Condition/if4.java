package Condition;

import java.util.Scanner;

public class if4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("3");
        } else if (a > 0 && b > 0 || b > 0 && c > 0 || a > 0 && c > 0) {
            System.out.println("2");
        } else if  (a > 0 || b > 0 ||c > 0){
            System.out.print("1");
        } else {
            System.out.println("Musbat son kiritilmadi!");
        }

    }
}
