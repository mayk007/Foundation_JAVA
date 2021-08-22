package Integer;

import java.util.Scanner;

public class int2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(M = ");
        short M = sc.nextShort();

        int T = M / 1000;

        System.out.printf("T = %d", T);



    }
}
