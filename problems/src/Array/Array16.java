package Array;

public class Array16 {
    static void Arr(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println("A[" + (i) + "] = " + arr[i]);
            System.out.println("A[" + (arr.length - 1 - i) + "] = " + arr[arr.length - 1 - i]);
        }
    }
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        Arr(arr);
    }
}
