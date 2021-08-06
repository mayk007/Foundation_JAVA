package Integer;

import java.util.Scanner;

public class int10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ixtiyoriy 3  xonali sonni kiriting: ");
        short A = sc.nextShort();

        int bir ,on, temp;

        bir = A % 10;
        temp = A - bir;



        System.out.printf("%d sonida %n%d ta birlik va %n%d ta o'nlik bor.", A, bir, on);


    }
}
