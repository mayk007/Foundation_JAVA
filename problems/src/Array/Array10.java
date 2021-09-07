package Array;


public class Array10 {
    static void Arr(int[] arr) {

        int count = 0;
        System.out.print("Natija: ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
             }
        }

        for (int j = arr.length - 1; j >= 0; j--) {

            if (arr[j] % 2 != 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }

        public static void main(String[] args) {

            int[] arr = new int[] {4, 5, 7, 8, 6, 9};

            Arr(arr);
        }
    }
