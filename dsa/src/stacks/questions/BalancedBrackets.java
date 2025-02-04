package stacks.questions;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("String: " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                boolean val = checkStack(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (str.charAt(i) == ']') {
                boolean val = checkStack(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }

            } else if (str.charAt(i) == '}') {
                boolean val = checkStack(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }

            }
        }

        if (st.empty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean checkStack(Stack st, Character character) {
        if (st.empty()) {
            return false;
        } else if (st.peek() != character) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
/*
String: ((a+b)
false


String: [a+b])
false

String: [(a+b)+{(c+d)*(e/f)}]
true

String: [(a+b)+{(c+d)*(e/f)}
false
 */
