package Function;

import java.util.Scanner;

public class FunSimple14 {

    static void ShiftRight(int a, int b, int c) {

        int temp;

        temp = a;
        a = c;
        c = b;
        b = temp;


        System.out.println(a + "," + b + "," + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A1, B1, C1;


        System.out.print("A1 = ");
        A1 = sc.nextInt();

        System.out.print("B1 = ");
        B1 = sc.nextInt();

        System.out.print("C1 = ");
        C1 = sc.nextInt();

        System.out.print( "A1,B1,C1 ==> ");
        ShiftRight(A1,B1,C1);

    }
}