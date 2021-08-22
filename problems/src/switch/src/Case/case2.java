package Case;

import java.util.Scanner;

public class case2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("(1 <= K <= 5), K =");
        int K = sc.nextInt();

        switch (K)
        {
            case 1:
                System.out.println("Yomon");
                break;
            case 2:
                System.out.println("Qoniqarsiz");
                break;
            case 3:
                System.out.println("Qoniqarli");
                break;
            case 4:
                System.out.println("Yaxshi");
                break;
            case 5:
                System.out.println("A'lo");
                break;
            default:
                System.out.println("Xato");



        }

    }
}
