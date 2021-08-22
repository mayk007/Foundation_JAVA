package Integer;

import java.util.Scanner;

public class int1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(L>100) L = ");
        short L = sc.nextShort();

        int m = L / 100;

        System.out.printf("m = %d", m);



    }
}
