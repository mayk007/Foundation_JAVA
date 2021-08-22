package Condition;

import java.util.Scanner;

public class if15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();

        int A, B, C, D;

        A = a + b;
        B = a + c;
        C = b + c;
        // 1) ikkita sonnig eng katta yig'indisini topib olamiz
        D = (A > B) ? Math.max(A, C) : Math.max(B, C);
        System.out.println("1-max son: " + D);

        // 2) ikkinchi max yig'indini topish
        if (A > B & A < C){
            System.out.println("2-Max son: " + A);
        } else if (B > A && B < C){
            System.out.println(" 2-max son: " + B);
        } else {
            System.out.println("2-max son: " + C);
        }
    }}
