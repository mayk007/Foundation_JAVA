package Condition;

import java.util.Scanner;

public class if10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();

        if (a != b){
          System.out.println(a + b);
        } else if (a==b){
            System.out.println(0);
        }
    }
}
