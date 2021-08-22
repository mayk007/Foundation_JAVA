package Condition;

import java.util.Scanner;

public class if13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();


        if (a > b && a < c || a > c && a < b){
            System.out.println(a);
        } else  if (a < b && b < c || c < b && b < a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
