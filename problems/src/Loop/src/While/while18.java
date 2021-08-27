package Loop.src.While;

import java.util.Scanner;

public class while18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(n>0), n = ");
        int n = sc.nextInt();

        int i = n;
        StringBuilder teskari = new StringBuilder();

        while (n>0){

           i = n%10;
           n = n/10;
           teskari.append(i);

        }

        System.out.println(teskari);
    }
}
