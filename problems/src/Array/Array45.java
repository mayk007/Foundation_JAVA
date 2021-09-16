package Array;

import java.util.Scanner;

public class Array45 {
    static void Arr(int[] arr) {

        int ayirma = Integer.MAX_VALUE;
        int a = 0, b = 0;

        for (int i = 0; i <arr.length-1 ; i++) {

            int temp_ayirma = Math.abs(arr[i] - arr[i+1]);

            if (temp_ayirma < ayirma){
                ayirma = temp_ayirma;
                a = i;
                b = i+1;
            }
        }
        System.out.println("Eng yaqin qo'shn elementlar indeksi: arr[" + a + "] va arr[" + b + "]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massiv elemntlari sonini kiriting (ex: 5 -> 5 ta elemeentdan iborat vector) = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter bilan " + n +" ta butun son kiriting!");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arr(arr);
    }
}
