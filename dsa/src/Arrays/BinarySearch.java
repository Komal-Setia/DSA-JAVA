package Arrays;

public class BinarySearch {

    //Applicable only for sorted array
    //If array is not sorted then first sort it and then apply binary search

    //O(log n)
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 20, 35, 42, 57, 101, 151, 167, 179, 190, 245};
        int low = 0;
        int high = arr.length - 1;
        int key = 190;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        //if low becomes grater than high
        System.out.println("Element not found");

    }
}
