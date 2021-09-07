package Array;


import java.util.Scanner;

public class Array11 {
    static int Arr(int[] arr, int K) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % K == 0){
                System.out.println(arr[i]);
            }
        }
        return 0;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = new int[] {2,5,4,8,7,9,4,54,6,4,7,5,4,2};

            System.out.println("(1 <= K < N), K = ");
            int K = sc.nextInt();


            Arr(arr, K);
        }
    }
