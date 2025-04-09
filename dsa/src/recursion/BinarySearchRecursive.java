package recursion;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 7;
        int start = 0, end = arr.length - 1;
        System.out.println("key is present at " + binarySearch(arr, key, start, end) + " index");
    }

    private static int binarySearch(int[] arr, int key, int start, int end) {

        //base case
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        //recursive condition
        if (key > mid) {
            return binarySearch(arr, key, mid + 1, end);
        } else {
            return binarySearch(arr, key, start, mid - 1);
        }
    }
}
