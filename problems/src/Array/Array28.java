package Array;

import java.util.Scanner;

public class Array28 {
    static int Arr(int[] arr) {

        int min  = arr[0];

        for (int i = 0; i < arr.length; i+=2) {

            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Orasida probel bilan " + n +" ta butun son kiriting!");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int MyArray = Arr(arr);
        System.out.println("Natija " + MyArray);
    }
}