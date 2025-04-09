package recursion;

public class sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println(findSum(arr, n));
    }

    public static int findSum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }

        return arr[n - 1] + findSum(arr, n - 1);
    }
}
