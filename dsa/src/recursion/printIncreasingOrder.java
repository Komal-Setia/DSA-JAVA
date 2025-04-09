package recursion;

public class printIncreasingOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        printInc(arr, n);
    }

    private static void printInc(int[] arr, int n) {
        if(n==0){
            return;
        }
        printInc(arr, n-1);
        System.out.println(n);
    }
}
