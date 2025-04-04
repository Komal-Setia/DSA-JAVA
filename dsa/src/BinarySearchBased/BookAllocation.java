package BinarySearchBased;

public class BookAllocation {
    public static void main(String[] args) {
        int noOfBooks = 3, noOfStudents = 2;
        int[] pagesArray = {15, 17, 20};
        if (noOfStudents > noOfBooks) {
            System.out.println(-1);
        } else {
            System.out.println(allocateBooks(pagesArray, noOfBooks, noOfStudents));
        }
    }

    public static int allocateBooks(int[] pagesArray, int noOfBooks, int noOfStudents) {
        int start = 0;
        int end = 0;
        int mid = 0;
        int ans = -1;
        for (int i = 0; i < pagesArray.length; i++) {
            end += pagesArray[i];
        }

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isValid(pagesArray, mid, noOfStudents)) {
                //search in left
                ans = mid;
                end = mid - 1;
            } else {
                //search in right
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isValid(int[] pagesArray, int maxPagesAllowed, int noOfStudents) {
        int student = 1;
        int pages = 0;

        for (int i = 0; i < pagesArray.length; i++) {
            if (pagesArray[i] > maxPagesAllowed) {
                return false;
            }
            if (pages + pagesArray[i] <= maxPagesAllowed) {
                pages = pages + pagesArray[i];
            } else {
                student++;
                pages = pagesArray[i];
            }
        }
        if (student > noOfStudents) {
            return false;
        } else {
            return true;
        }
    }
}
