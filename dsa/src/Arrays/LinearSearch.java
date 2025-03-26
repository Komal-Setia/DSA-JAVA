package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 7, 9, 1};
        int key = 7;
        int noOfBuckets = arr.length;
        int i;

        System.out.println("Length of arr = " + noOfBuckets);

        for (i = 0; i < noOfBuckets; i++) {
            if (key == arr[i]) {
                System.out.println("Yes key is present at index: " + i);
                break;
            }
        }

        if (i == noOfBuckets) {
            System.out.println("No key is not present in the array");
        }
    }
}
