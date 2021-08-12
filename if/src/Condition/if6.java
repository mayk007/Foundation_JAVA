package Condition;

import java.util.Scanner;

public class if6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();

        int C = Math.max(a,b);
        System.out.println(C);
    }
}
