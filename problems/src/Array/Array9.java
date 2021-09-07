package Array;


public class Array9 {
    static void Arr(int[] arr) {

        int count = 0;
        System.out.print("Natija: " );
        for (int i = arr.length-1; i >=0; i--) {

            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
                count ++;

            }
        }
        System.out.println("\tToqlar soni: " + count);
    }

    public static void main(String[] args) {

        int[] arr = new int[] {4, 5, 7, 8, 6, 9};

        Arr(arr);
    }
}
