package Condition;

import java.util.Scanner;

public class if20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("A= ");
        A = sc.nextInt();
        System.out.print("B= ");
        B = sc.nextInt();
        System.out.print("C= ");
        C = sc.nextInt();

        if (A - B < A - C) {
            System.out.println("A nuqtaga eng yaqin nuqta bu B nuqta va ular orasidagi masofa: " + (A - B));
        } else {
            System.out.println("A nuqtaga eng yaqin nuqta bu C nuqta va ular orasidagi masofa: " + (A - C));        }
    }
}
