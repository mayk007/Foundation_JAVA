package Integer;

import java.util.Scanner;

public class int26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(1>=K<=365) K= ");
        int K = sc.nextInt();

        int k = (K + 1) % 7;

        if (k==0){
            System.out.println("Yakshanba");
        } else if (k==1){
            System.out.println("Dushanba");
        }else if (k==2){
            System.out.println("Seshanba");
        }else if (k==3){
            System.out.println("Chorshanba");
        }else if (k==4){
            System.out.println("Payshanba");
        }else if (k==5){
            System.out.println("Juma");
        }else if (k==6){
            System.out.println("Shanba");
        }

    }
}
