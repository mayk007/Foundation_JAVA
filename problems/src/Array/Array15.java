package Array;

public class Array15 {
    static void Arr(int[] arr) {

        for (int i = 1; i < arr.length; i+=2) {
            System.out.println("A[" + (i) + "] = " + arr[i]);
        }
        for (int j = arr.length-1; j >= 0; j-=2) {
            System.out.println("A[" + (j-1) + "] = " + arr[j-1]);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        Arr(arr);
    }
}
