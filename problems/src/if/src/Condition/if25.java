package Condition;

import java.util.Scanner;

public class if25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x=");
        int x = sc.nextInt();

        if (x < -2 || x > 2) {
            System.out.println("y=" + (2 * x));
        } else{
            System.out.println("y=" + (-3 * x));
        }

    }
}
