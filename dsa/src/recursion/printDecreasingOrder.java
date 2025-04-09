package recursion;

public class printDecreasingOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        printDec(arr, n);
    }

    private static void printDec(int[] arr, int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printDec(arr, n-1);
    }
}
