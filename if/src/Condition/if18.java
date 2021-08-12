package Condition;

import java.util.Scanner;

public class if18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        System.out.print("(A == B || A == C), A= ");
        A = sc.nextInt();
        System.out.print("(B == A || B == C), B= ");
        B = sc.nextInt();
        System.out.print("(C == A || C == B), C= ");
        C = sc.nextInt();

        if (A == B) {
            System.out.println(3);
        } else if (A == C) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}
