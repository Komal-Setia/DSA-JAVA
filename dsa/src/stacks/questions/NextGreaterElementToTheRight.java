package stacks.questions;

import java.util.Stack;

public class NextGreaterElementToTheRight {
    //approach : -a+
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 10, 4, 87, 40};
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        nge[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() != 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        System.out.println("Output:");
        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i] + ",");
        }
    }
}

/*
Output:
4,7,7,10,87,87,-1,-1,
 */
