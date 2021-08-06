package Integer;

import java.util.Scanner;

public class int9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ixtiyoriy 3  xonali sonni kiriting: ");
        short A = sc.nextShort();

        int yuz = A / 100;


        System.out.printf("%d sonida %d ta Yuzliklar bor.", A, yuz);


    }
}
