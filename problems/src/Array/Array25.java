package Array;

import java.util.Scanner;

public class Array25 {
    static int Arr(int[] arr) {

        int d = arr[1]/arr[0];
        int D = 0;

        for (int i = 1; i < arr.length; i++) {

            D = arr[i] / arr[i-1];

            if (D!=d){
                return 0;
            }
        }
        return D;
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
        System.out.println("Natija: " + MyArray);
    }
}
