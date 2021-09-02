package Function;

import java.util.Scanner;

public class FunSample8 {

    static int AddRightDigit(int K, int R){

        int on = K, bir, sum;

        on = on / 10 * 10;
        bir =K % 10;
        sum = (on + bir) * 10 + R;


        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("K =  ");
        int K = sc.nextInt();

        System.out.print("(1<=R<=9), R =  ");
        int R = sc.nextInt();

        System.out.println("Natija: " + AddRightDigit(K,R));
    }
}
