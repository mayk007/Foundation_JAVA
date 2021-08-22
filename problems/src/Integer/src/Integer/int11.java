package Integer;

import java.util.Scanner;

public class int11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ixtiyoriy 3  xonali sonni kiriting: ");
        short A = sc.nextShort();

        int bir = A % 10;
        int on = (A % 100) / 10;
        int yuz = A / 100;
        int sumaary = bir + on + yuz;

        System.out.printf("kiritilgan son: %d \nyig'indi: %d", A, sumaary);


    }
}
