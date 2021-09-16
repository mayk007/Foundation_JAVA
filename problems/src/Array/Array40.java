package Array;

import java.util.Scanner;

public class Array40 {
    static int Arr(int[] arr, int R) {

        int temp;
        int near  = Math.abs(arr[0] - R);
        int r = 0;

        for (int i = 0; i < arr.length ; i++) {
            temp = Math.abs(arr[i] - R);

            if (temp < near && temp != 0) {
                r = arr[i];
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massiv elemntlari sonini kiriting (ex: 5 -> 5 ta elemeentdan iborat vector) = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter bilan " + n +" ta butun son kiriting!");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("R = ");
        int R = sc.nextInt();

        int MyArray = Arr(arr, R);
        System.out.println("Natija: " + MyArray);

    }
}
