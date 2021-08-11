package Condition;

import java.util.Scanner;

public class if3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A= ");
        int A = sc.nextInt();

        if (A > 0){
            System.out.println(++A);
        } else if (A < 0) {
            System.out.println(A-2);
        } else {
            System.out.print(10);
        }
    }
}
