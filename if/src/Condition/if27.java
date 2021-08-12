package Condition;

import java.util.Scanner;

public class if27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x: ");
        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("y: " +1);
        } else if (x % 2 !=1 ) {
            System.out.println("y: " + (-1));
        } else if (x<0){
            System.out.println("y: " + 0);
        }

    }
}
