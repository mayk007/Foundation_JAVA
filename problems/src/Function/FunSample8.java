package Function;

import java.util.Scanner;

public class FunSample8 {

    static void AddRightDigit(int K, int R){


        System.out.println("Natija " + K + "" + R);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("K =  ");
        int K = sc.nextInt();

        System.out.print("(1<=R<=9), R =  ");
        int R = sc.nextInt();

        AddRightDigit(K,R);


    }
}