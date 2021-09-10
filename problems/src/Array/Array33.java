package Array;

import java.util.Scanner;

public class Array33 {
    static int Arr(int[] arr) {

        int index = -1;
        for (int i = 1; i < arr.length-1; i++) {

            if (arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                index = i;
            }
        }
        return index;
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

        int MyArray = Arr(arr);
        System.out.println();
        if (MyArray == -1){
            System.out.println("Local minimum mavjud emas: " + MyArray);
        } else {
            System.out.println("Ocirgi local maximum element indeksi: " + MyArray);

        }

    }
}
