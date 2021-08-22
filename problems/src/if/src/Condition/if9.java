package Condition;

import java.util.Scanner;

public class if9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();

        if (a > b){
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("a = "+ a + "\nb = " +b);
        } else {
            System.out.println("a = "+ a + "\nb = " +b);
        }

    }
}
