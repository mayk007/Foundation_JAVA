package Condition;

import java.util.Scanner;

public class if5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();

        int count_musbat = 0;
        int count_manfiy = 0;
/*
        if (a > 0){
            count_musbat += 1;
        } else {
            count_manfiy += 1;
        }
        if (b > 0){
            count_musbat += 1;
        } else {
            count_manfiy += 1;
        }
        if (c > 0){
            count_musbat += 1;
        } else {
            count_manfiy += 1;
        }
*/
        // 2 -usul
        int A = (a > 0) ? (count_musbat+= 1):( count_manfiy += 1);
        int B = (b > 0) ? (count_musbat+= 1):( count_manfiy += 1);
        int C = (c > 0) ? (count_musbat+= 1):( count_manfiy += 1);

        System.out.println("Musbat sonlar: " + count_musbat);
        System.out.println("Manfiy sonlar: " + count_manfiy);
    }
}
