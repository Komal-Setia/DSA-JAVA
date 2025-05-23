package stacks.questions;

import java.util.Stack;

public class NextGreaterElementToTheLeft {

    public static void main(String[] args) {
        int[] arr = {30, 4, 20, 17, 10, 4, 87, 40};
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        st.push(arr[0]);
        nge[0] = -1;

        for(int i = 1; i<arr.length;i++){
            while(st.size()!=0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.empty()){
                nge[i]=-1;
            } else{
                nge[i]=st.peek();
            }

            st.push(arr[i]);
        }
        System.out.println("Output:");
        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i] + ",");
        }
    }
}
