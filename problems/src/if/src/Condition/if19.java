package Condition;

import java.util.Scanner;

public class if19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        System.out.println("NOTE: Kiritiladigan sonlarning 3 tasi o'zaro teng!");
        System.out.print("A= ");
        A = sc.nextInt();
        System.out.print("B= ");
        B = sc.nextInt();
        System.out.print("C= ");
        C = sc.nextInt();
        System.out.print("D= ");
        D = sc.nextInt();

        if (A == B && B == C) {
            System.out.println(4);
        } else if (A == B && B == D) {
            System.out.println(3);
        } else if (A == C && C == D) {
            System.out.println(2);
        } else if (B == C && B == D) {
            System.out.println(1);
        } else {
            System.out.println("Kiritilgan sonlarning 3 tasi o'zaro teng emas! Sonlarni Qaytadan kiriting!");
        }
    }
}
