package Function;

import java.util.Scanner;

public class FunSample9 {

    static int AddLeftDigit(int K, int R){

        int a, b = K,  temp = 1, sum;

        while (K>0){
            a = K % 10;
            K = K/10;
            temp *=10;

        }
        sum = R * temp + b;


        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("K =  ");
        int K = sc.nextInt();

        System.out.print("(1<=R<=9), R =  ");
        int R = sc.nextInt();

        System.out.println("Natija: " + AddLeftDigit(K,R));
    }
}
