package Loop.src.While;

import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,i,sum, temp;

        System.out.print("(n>0), n=");
        n = sc.nextInt();

        // 1-usul
//        temp = n%2;
//        sum = n;
//
//        switch (temp) {
//            case 0 -> {
//                i = 2;
//                while (i < n) {
//
//                    sum *= (n - i);
//                    i += 2;
//                 }
//           }
//            case 1 -> {
//                i = 2;
//                while (i < n) {
//
//                    sum *= (n - i);
//                    i += 2;
//                }
//            }
//
//        }
//        System.out.println(n + "!! = " + sum);


        //2-usul
        i = 2;
        sum = n;

        while (i<n){

            System.out.print(sum);
            sum *= (n-i);
            System.out.println("*" + (n-i)+ "=" +sum);
            i+=2;
        }
        System.out.println("Natija: "+ n + "!! = " + sum);
    }
}

