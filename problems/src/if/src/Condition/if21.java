package Condition;

import java.util.Scanner;

public class if21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;

        System.out.print("x= ");
        x = sc.nextInt();
        System.out.print("y= ");
        y = sc.nextInt();

        if (x == 0 && y ==0){
            System.out.println(0);
        } else if (x != 0 & y == 0){
            System.out.println(1);
        } else if (x == 0 && y != 0 ){
            System.out.println(2);
        } else {
            System.out.println(3);
        }

    }
}
