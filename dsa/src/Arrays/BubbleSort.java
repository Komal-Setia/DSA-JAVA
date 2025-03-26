package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int size = arr.length;

        //Printing Before Sorting
        System.out.print("Before Sorting : [ ");
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.print("]\n");

        //Sorting Logic
        for (int i = 0; i <= size - 2; i++) {
            for (int j = 0; j <= size - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //Printing After Sorting
        System.out.print("After Sorting : [ ");
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.print("]");
    }
}
