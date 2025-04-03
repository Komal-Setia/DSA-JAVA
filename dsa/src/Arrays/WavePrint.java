package Arrays;

public class WavePrint {
    /*
    1 4 7 10
    2 5 8 11
    3 6 9 12

    expected output-> 1,2,3,6,5,4,7,8,9,12,11,10
     */

    public static void main(String[] args) {

        int[][] arr = {
                {1, 4, 7, 10},
                {2, 5, 8, 11},
                {3, 6, 9, 12}
        };
        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                //even column
                //Print top to bottom
                for (int i = 0; i < rows; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                //odd column
                //Print bottom to top
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }


    }
}
