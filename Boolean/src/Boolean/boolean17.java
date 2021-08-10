package Boolean;

import java.util.Scanner;

public class boolean17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(Uch xonali musabat sonni kiriting: ");
        int A = sc.nextInt();

        boolean D =  A % 2 != 0;

        System.out.println(D);

    }
}
