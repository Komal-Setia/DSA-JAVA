package stacks.questions;

import java.util.Stack;

public class NextGreaterElementToTheRight2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 10, 4, 87, 40};
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        st.push(0);// push index
        for(int i = 1;i<arr.length;i++){
            while(st.size()!=0 && arr[i]>arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while (st.size()>0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
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
