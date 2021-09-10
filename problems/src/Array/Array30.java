package Array;

import java.util.Scanner;

public class Array30 {
    static int Arr(int[] arr) {

        int count = 0;
        System.out.println("Indekslar: ");
        for (int i = 1; i < arr.length; i++) {

            if (arr[i-1] > arr[i]){
                System.out.println("arr[" + (i-1) + "]");
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter bilan" + n +" ta butun son kiriting!");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int MyArray = Arr(arr);
        System.out.println("Indekslar soni: " + MyArray);
    }
}