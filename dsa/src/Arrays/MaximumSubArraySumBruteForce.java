package Arrays;

public class MaximumSubArraySumBruteForce {
    public static void main(String []args){
        int n = 5;
        int arr[] = {1,2,3,4,5};

        //Print all subarrays
        for(int start = 0; start < n ; start++) {
            for(int end = start; end <n; end++) {
                for(int i = start; i<=end; i++){
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        //Logic
        int max_sum = Integer.MIN_VALUE;
        for(int start = 0; start < n ; start++) {
            int currSum = 0;
            for(int end = start; end <n; end++) {
                    currSum = currSum + arr[end];
                    max_sum = Math.max(currSum, max_sum);
            }
        }
        System.out.println("Maximum SubArray Sum: " + max_sum);


    }
}
