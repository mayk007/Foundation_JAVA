package Array;

public class Array32 {
    static void Arr(int[] arr) {

        for (int i = 0; i < arr.length / 2; i+=2) {
            System.out.println("A[" + (i) + "] = " + arr[i]);
            System.out.println("A[" + (i) + "] = " + arr[i+1]);

            System.out.println("A[" + (arr.length - 1 - i) + "] = " + arr[arr.length - 1 - i]);
            System.out.println("A[" + (arr.length - 2 - i) + "] = " + arr[arr.length - 2 - i]);

        }
    }
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        Arr(arr);
    }
}
