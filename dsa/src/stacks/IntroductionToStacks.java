package stacks;
import java.util.*;
public class IntroductionToStacks {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();

		st.push(10);//Add elements in stack
		System.out.println("Stack ->" + st);
		if(!st.empty()) {
			System.out.println("Top Element "+ st.peek()); //Top element
		}
		st.push(20);
		System.out.println("Stack ->" + st);
		st.push(30);
		System.out.println("Stack ->" + st);
		st.push(40);
		System.out.println("Stack ->" + st);
		st.push(50);
		System.out.println("Stack ->" + st);
		if(!st.empty()) {
			System.out.println("Top Element "+ st.peek()); //Top element
		}
		if(!st.empty()) {
			System.out.println("Removed Element "+ st.pop()); //Remove Element
		}
		System.out.println("Stack ->" + st);
		if(!st.empty()) {
			System.out.println("Top Element "+ st.peek()); //Top element
		}
		System.out.println("Stack ->" + st);

	}

}
