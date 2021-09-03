package Function;

import java.util.Scanner;

public class FunSimple36 {

   static int F1 = 0, F2 = 1, Fn = 0;

   static int Fib(int n){

       if (n>0){
           Fn = F1 + F2;
           F1 = F2;
           F2 = Fn;
           System.out.println(Fn);

           Fib(n-1);
       }
       return Fn;

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(N>0) N = ");
        int N = sc.nextInt();

        System.out.println("Natija: " + Fib(N-2));
    }
}
