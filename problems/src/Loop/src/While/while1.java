package Loop.src.While;

import java.util.Scanner;

public class while1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(A>B), A=");
        int A = sc.nextInt();
        System.out.print("(B<A), B=");
        int B = sc.nextInt();

        // 1-usul with break statement
//        int count = 1;

//        while (count > 0){
//
//            A =  A - B;
//
//            if (A < B){
//                System.out.print("A kesmaning bo'sh qismi: " + A);
//                break;
//            }
//            count++;

        // 2-usul
        while (A - B >= 0){

            A =  A - B;
        }
        System.out.print("A kesmaning bo'sh qismi: " + A);

    }

}
