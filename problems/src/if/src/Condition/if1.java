package Condition;

import java.util.Scanner;


public class if1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A= ");
        int A = sc.nextInt();
        // 1-usul
//        if (A > 0){
//            System.out.println(++A);
//        } else {
//            System.out.println(A);
//        }

        // 2-usul
        int B = A > 0 ? (++A) : A;

        System.out.print(B);

    }
}
