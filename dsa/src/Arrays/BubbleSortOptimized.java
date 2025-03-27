package Arrays;

public class BubbleSortOptimized {
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
        for (int i = 0; i < size - 1; i++) {
            int cnt = 0;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    cnt++;
                }
            }

            if (cnt == 0){
                break;
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
