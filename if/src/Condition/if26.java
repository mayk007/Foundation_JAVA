package Condition;

import java.util.Scanner;

public class if26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x=");
        int x = sc.nextInt();

        if (x <= 0) {
            System.out.println("y=" + (-x));
        } else if (0 < x && x < 2){
            System.out.println("y=" + (x*x));
        }else {
            System.out.println("y="+4);
        }

    }
}
