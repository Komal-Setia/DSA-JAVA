package stacks.questions;

import java.util.*;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Input String: " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (st.peek() == '(') {
                    System.out.println("true"); // Contains duplicate bracket
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop(); //pop other chars
                    }
                    st.pop(); //pop corresponding opening bracket
                }
            } else {
                st.push(str.charAt(i));
            }
        }

        System.out.println("false"); //Does not contain duplicate bracket
    }
}

/*
Input String: ((a+b)+(c+d))
false
*/

/*
Input String: (a+b)+((c+d))
true
 */