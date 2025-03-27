package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int size = arr.length;
        int i, j;

        //Printing Before Sorting
        System.out.print("Before Sorting : [ ");
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.print("]\n");

        //Sorting Logic
        for (i = 0; i < size - 1; i++) {
            int min = i;
            for (j = i + 1; j <= size - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        //Printing After Sorting
        System.out.print("After Sorting : [ ");
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.print("]");
    }
}
