package Function;

import java.util.Scanner;

public class FunSample10 {

    static void Swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + ", " + b);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("A = ");
        A = sc.nextInt();

        System.out.print("B = ");
        B = sc.nextInt();

        System.out.print("C = ");
        C = sc.nextInt();

        System.out.print("D = ");
        D = sc.nextInt();

        System.out.print("(A,B) ");
        Swap(A, B);
        System.out.print("(C,D) ");
        Swap(C, D);


    }
}