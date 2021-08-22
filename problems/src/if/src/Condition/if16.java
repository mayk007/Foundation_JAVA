package Condition;

import java.util.Scanner;

public class if16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        System.out.print("A= ");
        A = sc.nextInt();
        System.out.print("B= ");
        B = sc.nextInt();
        System.out.print("C= ");
        C = sc.nextInt();

        if (A < B && B < C) {
            System.out.println("A= " + A / 2 + "\nB= " + B / 2 + "\nC= " + C / 2);
        } else {
            System.out.println("A= " + A * (-1) + "\nB= " + B * (-1) + "\nC= " + C * (-1));
        }
    }
}
