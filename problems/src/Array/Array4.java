package Array;


import java.util.Scanner;

public class Array4 {
    static void Arr(int[] n, int a, int d) {

        for (int i = 1; i < n.length; i++) {

            a =  a * d;
            System.out.println("A" + i + " = " + a);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("d = ");
        int d = sc.nextInt();

        Arr(arr,a,d);
    }
}
