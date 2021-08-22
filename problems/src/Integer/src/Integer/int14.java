package Integer;

import java.util.Scanner;

public class int14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ixtiyoriy 3  xonali sonni kiriting: ");
        short A = sc.nextShort();

        int yuz = A / 100;
        int on = (A % 100) / 10;
        int bir = A % 10;
        int summary = bir * 100 + yuz * 10 + on;

        System.out.printf("kiritilgan son: %d \nteskari son: %d", A, summary);


    }
}
