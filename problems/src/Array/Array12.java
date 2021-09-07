package Array;


import java.util.Scanner;

public class Array12 {
    static void Arr(int[] arr) {

        for (int i = 0; i < arr.length; i+=2) {

            System.out.println("A[" + i + "] = " + arr[i]);
        }

    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

            Arr(arr);
        }
    }
