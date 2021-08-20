package For;

import java.util.Scanner;

public class  for1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("k= ");
         int k = in.nextInt();
        System.out.print("(n>0, n= ");
         int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println(i + ") " + k);

        }
    }
}
