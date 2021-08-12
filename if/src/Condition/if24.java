package Condition;

import java.util.Scanner;

public class if24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x=");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("y=" + (2 * Math.sin(x)));
        } else {
            System.out.println("y=" + (x - 6));
        }

    }
}
