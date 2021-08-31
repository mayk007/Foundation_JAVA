package Loop.src.While;
;
import java.util.Scanner;

public class while26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(n>1), n = ");
        int n = sc.nextInt();

        int F1=1, F2=1, Fk = 0, i=3;

        while (i < n) {

            Fk = F1 + F2;
            F1 = Fk - F1;
            F2 = Fk;
            i++;
            System.out.println(Fk);
            if (Fk == n){
                System.out.println(n + "sonidan kichik son :" + F1);
            }
            if (Fk != n && Fk > n){
                System.out.println(n + " soni dan katta 1-Fibonachchi soni: " + Fk);
                break;
            }
        }


    }
}
