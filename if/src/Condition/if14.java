package Condition;

import java.util.Scanner;

public class if14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();

        int D = (a<b)? Math.min(a,c):Math.min(b,c);
        System.out.println(D);
        int E = (a>b)? Math.max(a,c):Math.max(b,c);
        System.out.println(E);
    }
}
