package Array;

import java.util.Scanner;

public class Array47 {
    static int Arr(int[] arr) {

        int count = 1;
        System.out.print("Natija: " + arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }

            if (i == j){
                System.out.print(arr[i] + " ");
                count++;
            }

        }
        return count;
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


        int MyArray = Arr(arr);
        System.out.println("\nHar xil elementlar soni: " + MyArray);

    }
}
