package BinarySearchBased;

import static java.util.Arrays.sort;

public class AggressiveCows {
    public static void main(String[] args) {
        int noOfStalls = 5, noOfCows = 3;
        int[] stallsArray = {1, 2, 8, 4, 9};

        System.out.println(getDistance(noOfStalls, noOfCows, stallsArray));
    }

    private static int getDistance(int noOfStalls, int noOgCows, int[] stallsArray) {
        sort(stallsArray);
        int st = stallsArray[1], end = stallsArray[noOfStalls - 1] - stallsArray[1], ans = -1;

        while (st <= end) {

            int mid = (st + end) / 2;
            if (isPossible(noOfStalls, noOgCows, stallsArray, mid)) {
                //right
                ans = mid;
                st = mid + 1;

            } else {
                //left
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int noOfStalls, int noOfCows, int[] stallsArray, int maximumAllowedDistance) {
        int cows = 1;
        int lastStallPos = stallsArray[0];
        for (int i = 1; i < noOfStalls; i++) {
            if (stallsArray[i] - lastStallPos >= maximumAllowedDistance) {
                cows++;
                lastStallPos = stallsArray[i];
            }
            if (cows == noOfCows) {
                return true;
            }
        }
        return false;
    }
}
