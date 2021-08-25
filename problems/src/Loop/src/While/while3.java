package Loop.src.While;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n=");
        int n = sc.nextInt();
        System.out.print("(k=");
        int k = sc.nextInt();

        int butun = 0;
        int qoldiq = 0;
        int bolinuvchi = n;

        while (bolinuvchi-k>=0){

            bolinuvchi = bolinuvchi-k;
            qoldiq = bolinuvchi;
            butun++;
        }
        System.out.println(n + "/" + k + " = " + butun + "/" + qoldiq);
    }
}

