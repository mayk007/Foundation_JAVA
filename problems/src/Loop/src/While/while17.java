package Loop.src.While;

import java.util.Scanner;

public class while17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("m = ");
        int m = sc.nextInt();

        int i = 0;
        int sum = n;
        while (sum>=m){

            sum = sum-m;
            i++;
        }
        System.out.println("Butun: " + i + "\tqoldiq: " + sum);
    }
}
