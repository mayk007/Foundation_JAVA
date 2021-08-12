package Condition;

import java.util.Scanner;

public class if30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(1>a<999), a: ");
        int a = sc.nextInt();

        if (a < 100 & a % 2 != 0){
            System.out.println("Ikki xonali toq son!");
        } else if(a <100 && a % 2 == 0) {
            System.out.println("Ikki xonali juft son!");
        } else if (a >= 100  && a % 2 == 0) {
            System.out.println("Uch xonali juft son!");
        }else if  (a >= 100  && a % 2 != 0){
            System.out.println("Uch xonali toq son!");
        } else {
            System.out.println("Son nolga teng!");
        }

    }
}
