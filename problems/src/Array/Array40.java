package Array;

//import java.util.Scanner;
//public class Array40 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int r = in.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = in.nextInt();
//        }
//        int min = Integer.MAX_VALUE;
//        int index = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            int ayirma = Math.abs(r-a[i]);
//
//            if (ayirma<min){
//                min = ayirma;
//                index = a[i];
//            }
//        }
//        System.out.println(index);
//    }
//}
//
import java.util.Scanner;

public class Array40 {
    static int Arr(int[] arr, int R) {

        int temp;
        int r  = Integer.MAX_VALUE;
        int nearnum = 0;

        for (int i = 0; i < arr.length ; i++) {
            temp = Math.abs(arr[i] - R);

            if (temp < r) {
                r = temp;
                nearnum = arr[i];
            }
        }
        return nearnum;
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

        int MyArray = Arr(arr, R);
        System.out.println("Natija: " + MyArray);

    }
}
