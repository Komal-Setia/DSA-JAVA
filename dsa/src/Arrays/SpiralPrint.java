package Arrays;

import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        spiralPrint(arr, rows, cols);
    }

    private static void spiralPrint(int[][] arr, int rows, int cols) {
        int sr = 0, sc = 0;
        int er = rows - 1, ec = cols - 1;

        while (sr <= er && sc <= ec) {
            //print first row
            for (int i = sc; i <= ec; i++) {
                //row fixed
                System.out.print(arr[sr][i] + " ");
            }
            sr++;
            //for last column
            for (int i = sr; i <= er; i++) {
                //column fixed
                System.out.print(arr[i][ec] + " ");
            }
            ec--;
            //print last row
            for (int i = ec; i >= sc; i--) {
                //row fixed
                System.out.print(arr[er][i] + " ");
            }
            er--;
            //print first column
            for (int i = er; i >= sr; i--) {
                //column fixed
                System.out.print(arr[i][sc] + " ");
            }
            sc++;
        }
    }
}
