package Condition;

import java.util.Scanner;

public class if23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2, x3, y3;

        System.out.print("x1= ");
        x1 = sc.nextInt();
        System.out.print("y1= ");
        y1 = sc.nextInt();
        System.out.print("x2= ");
        x2 = sc.nextInt();
        System.out.print("y2= ");
        y2 = sc.nextInt();
        System.out.print("x3= ");
        x3 = sc.nextInt();
        System.out.print("y3= ");
        y3 = sc.nextInt();


//        if (x1 == x2 && y2 == y3){
//            System.out.println("\nx4= " +x3 + "\ny4= " + y1);
//        } else {
//            System.out.println("berilgan kordinatalar to'g'ri to'rtburchak hozil qilmaydi !");
//        }

        System.out.println("Bu misolni yaxshi tushunmadim!");

        if (x1 == x2) {
            System.out.println("x4= " + x3);
        }
        if (x1 == x3) {
            System.out.println("x4= " + x2);
        }
        if (y1 == y2) {
            System.out.println("y4= " + y3);
        }
        if (y1 == y3) {
            System.out.println("y4= " + y2);
        }
    }
}
