package Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int row = 3, col = 5;
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        int key = 6;

        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found key at index " + i + "," + j);
                    break;
                }
            }
            if (j < col) {
                break;
            }
        }
        if (i == row) {
            System.out.println("Key is not present");
        }
    }
}
