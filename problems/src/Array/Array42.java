package Array;

import java.util.Scanner;

public class Array42 {
    static int Arr(int[] arr, int R) {

        int yigindi = Integer.MAX_VALUE;
        int qoshiluvchi_1 = 0, qoshiluvchi_2 = 0;

        for (int i = 0; i <arr.length-1 ; i++) {

            int ayirma = Math.abs(R - (arr[i] + arr[i+1]));

            if (ayirma < yigindi){
                yigindi = ayirma;
                qoshiluvchi_1 = arr[i];
                qoshiluvchi_2 = arr[i+1];
            }
        }
        System.out.println("Qo'shiluvchilar: " + qoshiluvchi_1 + " va " + qoshiluvchi_2);
        return qoshiluvchi_1 + qoshiluvchi_2;
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

        System.out.println("R = ");
        int R = sc.nextInt();
        int MyArray = Arr(arr,R);
        System.out.println("Eng katta yi'g'indi: " + MyArray);

    }
}
