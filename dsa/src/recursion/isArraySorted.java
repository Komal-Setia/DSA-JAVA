package recursion;

public class isArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        if (isArraySortedOrNot(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isArraySortedOrNot(int[] arr, int n) {
        //base case
        if (n == 0 || n == 1) {
            return true;
        }

        //recursive case
        if (arr[n - 2] <= arr[n - 1] && isArraySortedOrNot(arr, n - 1)) {
            return true;
        }
        return false;

    }
}
