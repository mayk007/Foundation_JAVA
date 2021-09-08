package Array;

import java.util.Scanner;

public class Array23 {
    static double Arr(int[] arr, int K, int L) {

        double sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            count++;
            System.out.println("N[" + i + "] = " + arr[i]);
            if (i == K-1){
                i += (L-K)+1;
            }

        }
        return sum / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println("(0<=K<=L<N), N length = " + N.length);
        System.out.print("K = ");
        int K = sc.nextInt();

        System.out.print("L = ");
        int L = sc.nextInt();



        double MyArray = Arr(N, K, L);
        System.out.println("O'rta arifmetik = "+ MyArray);
    }
}
