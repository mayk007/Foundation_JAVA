package Boolean;

import java.util.Scanner;

public class boolean33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A= ");
        int A = sc.nextInt();
        System.out.print("B= ");
        int B = sc.nextInt();
        System.out.print("C= ");
        int C = sc.nextInt();

        // Uchburchak har tomonining uzunligi qolgan ikki tomon uzunliklari yig'indisidan kichik, ayirmasidan esa kattadir.

        // 1-usul
//        boolean D = (A + B > C && A - B < C || A + B > C && B - A < C) || (A + C > B && A - C < B || A + C > B && C - A < B) || (B + C > A && B - C < A || B + C > A && C - B < A);

        //2-usul(optimized)
        boolean D = A + B > C && Math.abs(A - B) < C || A + C > B && Math.abs(A - C) < B || B + C > A && Math.abs(B- C) < A;

        System.out.println(D);
    }
}
