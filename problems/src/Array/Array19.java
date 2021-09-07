package Array;

public class Array19 {
    static void Arr(int[] arr) {

        int min = arr[0];
        int max = arr[arr.length-1];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (min < arr[i] && arr[i] < max){
                count = i;
            }
        }
        System.out.println("natija : " + count);
    }
    public static void main(String[] args) {

        int[] arr = new int[] {2,5,4,8,9,2,3,4,5,4};

        Arr(arr);
    }
}
