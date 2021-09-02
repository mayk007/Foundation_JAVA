package Function;

import java.util.Scanner;

public class FunSimple13 {

    static void SortDec3(int a, int b, int c) {

        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

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
        SortDec3(A1,B1,C1);

    }
}