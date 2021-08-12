package Condition;

import java.util.Scanner;

public class if8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();

        int max = Math.max(a,b);
        int min = Math.min(a,b);

        System.out.println("max: " + max + "\nmin: " + min);
    }
}
