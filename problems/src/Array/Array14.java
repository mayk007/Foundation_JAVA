package Array;

public class Array14 {
    static void Arr(int[] arr) {

        for (int i = 0; i < arr.length; i+=2) {
            System.out.println("A[" + (i) + "] = " + arr[i]);
        }
        for (int i = 1; i < arr.length; i+=2) {
            System.out.println("A[" + (i) + "] = " + arr[i]);
        }

    }

        public static void main(String[] args) {

            int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

            Arr(arr);
        }
    }
