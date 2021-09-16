package Array;

import java.util.Scanner;
<<<<<<< HEAD

public class Array50 {
    static int Arr(int[] arr ) {

        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                count ++;
            }
        }
        return count;
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
        System.out.println("Natija: " + MyArray);

=======

public class Array50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max =-1;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < a.length-1; i++) {
            if (a[i-1] < a[i] && a[i] > a[i+1]){
                max = a[i];
                if (min>max){
                    min = max;
                }
            }
        }
        System.out.println(min);
>>>>>>> 7d44bdd480ed9753a39ce97e95a3d650967cf7bc
    }
}