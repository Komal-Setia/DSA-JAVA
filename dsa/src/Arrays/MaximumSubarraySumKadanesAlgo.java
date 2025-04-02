package Arrays;

public class MaximumSubarraySumKadanesAlgo {
    public static void main(String []args){
        int n=5;
        int arr[] ={-1,-2,-3,-4,-5};

        //Printing subarrays
        for(int start = 0; start < n ; start++){
            for (int end = start; end < n; end++){
                for(int i=start; i<=end; i++){
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        //Logic
        int currSum = 0, max_sum = Integer.MIN_VALUE;
        for(int val : arr){
            currSum += val;
            max_sum = Math.max(currSum,max_sum);
            if(currSum<0){
                currSum = 0;
            }
        }
        System.out.println("Maximum SubArray Sum is: " + max_sum);
    }
}
