package Array;

import java.util.Scanner;

public class Array35 {
    static int Arr(int[] arr) {

        int max = arr[1];

        for (int i = 1; i < arr.length-1; i++) {

            if (arr[i-1] < arr[i] && arr[i] > arr[i+1] && max > arr[i]){
                max = arr[i];
            }

        }
        return max;
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
            System.out.println("Local maximum mavjud emas: " + MyArray);
        } else {
            System.out.println("Local maximum elementlar orasida eng kichigi: " + MyArray);

        }
    }

//
//
//    public class Array50 {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt();
//            int a[] = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = in.nextInt();
//            }
//            int max =-1;
//            int min = Integer.MAX_VALUE;
//            for (int i = 1; i < a.length-1; i++) {
//                if (a[i-1] < a[i] && a[i] > a[i+1]){
//                    max = a[i];
//                    if (min>max){
//                        min = max;
//                    }
//                }
//            }
//            System.out.println(min);
//        }
//    }
}
