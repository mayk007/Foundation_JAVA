package Integer;

import java.util.Scanner;

public class int10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ixtiyoriy 3  xonali sonni kiriting: ");
        short A = sc.nextShort();

        int bir ,on, temp;

        bir = A % 10;
        on = (A % 100)/10;

        System.out.printf("birliklar %d %no'nliklar %d ", bir, on);


    }
}
