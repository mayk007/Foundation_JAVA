package Array;


import java.util.Scanner;

public class Array13 {
    static void Arr(int[] arr) {

        for (int i = arr.length-1; i > 0; i-=2) {

            System.out.println("A[" + (i) + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};

        Arr(arr);
    }
}
