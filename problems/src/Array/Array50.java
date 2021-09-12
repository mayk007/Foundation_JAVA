package Array;

import java.util.Scanner;

public class Array50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max =-1;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < a.length-1; i++) {
            if (a[i-1] < a[i] && a[i] > a[i+1]){
                max = a[i];
                if (min>max){
                    min = max;
                }
            }
        }
        System.out.println(min);
    }
}