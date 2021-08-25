package Loop.src.While;
import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(n>0), n=");
        int n = sc.nextInt();

        int i = 1;
        int daraja = 0;
        int count = 0;

        while (i<n){

            i*=2;
            daraja = i;
            count++;
        }

        if (n==1) {
            System.out.println(n + "= 2^"+0);
        }else if (daraja==n){
            System.out.println(n + "= 2^"+count);
        } else System.out.println("2 ning darajasi emas!");
    }
}
