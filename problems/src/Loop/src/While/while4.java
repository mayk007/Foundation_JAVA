package Loop.src.While;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(n>0), n=");
        int n = sc.nextInt();

        int i = 1;
        int daraja = 0;

        while (i<n){

            i*=3;
            daraja = i;
        }

        if (n==i || daraja==n){
            System.out.println("3-ning darajasi");
        }else System.out.println("3-ning darajasi emas");
    }
}
