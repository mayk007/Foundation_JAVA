package Array;

import java.util.Scanner;

public class Array27{
    static int Arr(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > 0 && arr[i-1] > 0 || arr[i] < 0 && arr[i-1] < 0 ){
                System.out.print("Ketma-ketlikni buzgan element indeksi ");
                return i;
            }
        }
        return 0;
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
