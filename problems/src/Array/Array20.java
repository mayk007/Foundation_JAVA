package Array;

import java.util.Scanner;

public class Array20 {
    static int Arr(int[] arr, int K, int L) {

        L = arr.length - L;
        int sum = 0;

        for (int i = K+1; i < arr.length - L; i++) {

            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[] {5,10,15,20,25};

        System.out.println("(0<=K<=L<N), N length = " + N.length);
        System.out.print("K = ");
        int K = sc.nextInt();

        System.out.print("L = ");
        int L = sc.nextInt();



        int MyArray = Arr(N, K, L);
        System.out.println("Natija:" + MyArray);
    }
}
