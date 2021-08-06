package Integer;

import java.util.Scanner;

public class int3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("bayt = ");
        short bayt = sc.nextShort();

        int Kb = bayt / 1024;

        System.out.printf("Kb = %d", Kb);



    }
}
