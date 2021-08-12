package Condition;

import java.util.Scanner;

public class if28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yilni kiriting: ");
        int Y = sc.nextInt();

        if (Y > 0 && Y < 100 && Y % 4 ==0){
            System.out.println("Kabisa yili: " + 366 + " kun!");
        } else if (Y >= 100 && Y % 400 == 0) {
            System.out.println("Kabisa yili: " + 366 + " kun!");
        } else {
            System.out.println("Kabisa yili emas: " + 365 + " kun!");
        }

    }
}
