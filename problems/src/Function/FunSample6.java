package Function;

import java.util.Scanner;

public class FunSample6 {

    static void DigitCountSum(int n){

        int count = 0;
        int sum = 0;

        while (n != 0){

            sum += n%10;
            n = n/10;
            count++;

        }
        System.out.println("raqamlar soni " + count);
        System.out.println("Yig'indi: " + sum);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a =  ");
        int a = sc.nextInt();
        System.out.print("b =  ");
        int b = sc.nextInt();
        System.out.print("c =  ");
        int c = sc.nextInt();

        System.out.print("a ning "); DigitCountSum(a);
        System.out.print("b ning "); DigitCountSum(b);
        System.out.print("c ning "); DigitCountSum(c);

    }
}