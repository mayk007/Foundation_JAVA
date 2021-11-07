package Array;

import java.util.Scanner;

public class Array51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massiv elemntlari soni: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("A Massiv elementlarini kiriting ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        System.out.println("B Massiv elementlarini kiriting ");

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }




    }
}

