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
        int mid;
        int ans = -1;
        for (int i = 0; i < noOfBooks; i++) {
            end += pagesArray[i];
        }

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isValid(pagesArray, noOfBooks, noOfStudents, mid)) {
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

    private static boolean isValid(int[] pagesArray, int noOfBooks, int noOfStudents, int maxPagesAllowed) {
        int student = 1;
        int pages = 0;

        for (int i = 0; i < noOfBooks; i++) {
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
        return student <= noOfStudents;
    }
}
