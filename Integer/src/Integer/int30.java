package Integer;

import java.util.Scanner;

public class int30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("yilni kiriting:  ");
        int a = sc.nextInt();

        int b = a / 100 + 1;
        System.out.printf("%d yil %d yillikka kiradi!", a, b);

    }
}
