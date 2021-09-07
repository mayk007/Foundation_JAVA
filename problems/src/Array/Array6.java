package Array;


import java.util.Scanner;

public class Array6 {
    static <F1> void Arr(int[] n, int a, int b) {

        int An=0, a0 = a, a1 = b;

        for (int i = 2; i < n.length; i++) {

            An =  a0 + a1;
            a0 = An;
            a1 = An;

            System.out.println("A" + i + " = " + An);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.print("A = ");
        int A = sc.nextInt();

        System.out.print("B = ");
        int B = sc.nextInt();

        Arr(arr,A,B);
    }
}
