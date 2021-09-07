package Array;


import java.util.Scanner;

public class Array5 {
    static void Arr(int[] n ) {

        int Fn,  F0 = 1, F1 = 1;

        for (int i = 2; i < n.length; i++) {

            Fn =  F1 + F0;
            F0 = F1;
            F1 = Fn;

            System.out.println("F" + i + " = " + Fn);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        Arr(arr);
    }
}
