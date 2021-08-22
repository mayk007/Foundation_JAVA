package Condition;

import java.util.Scanner;

public class if11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();

        if (a != b){
            System.out.println(Math.max(a,b));
        } else if (a==b){
            System.out.println(0);
        }
    }
}
