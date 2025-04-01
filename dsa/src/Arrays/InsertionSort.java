package Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int size = arr.length;
        int j;

        //Printing Before Sorting
        System.out.print("Before Sorting : [ ");
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.print("]\n");

        //Sorting Logic
        for (int i = 1; i <= size-1; i++ ){
            int current = arr[i];
            for(j=i-1; j>=0 && arr[j]>current; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }

        //Printing After Sorting
        System.out.print("After Sorting : [ ");
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.print("]");
    }
}
