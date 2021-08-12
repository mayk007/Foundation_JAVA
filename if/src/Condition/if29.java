package Condition;

import java.util.Scanner;

public class if29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();

        if (a > 0 && a % 2 != 0){
            System.out.println("Musbat toq son!");
        } else if(a > 0 && a % 2 == 0) {
            System.out.println("Musbat juft son!");
        } else if (a < 0  && a % 2 == 0) {
            System.out.println("Manfiy just son!");
        }else if  (a < 0  && a % 2 != 0){
            System.out.println("Manfiy toq son!");
        } else {
            System.out.println("Son nolga teng!");
        }

    }
}
