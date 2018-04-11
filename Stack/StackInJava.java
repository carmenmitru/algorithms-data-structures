import java.util.*;
/*
Stack Class : 
- push(element)
- pop()
- peek() - returns the element on the top of the stack
- isEmpty() - check if the stack is empty
*/
class Solution {
	public static void main(String[] args) {
		// create stack that will contain String elements
		Stack<String> st = new Stack<String>();
		
		// populating stack
		st.push("Andrew");
		st.push("Sara");
		st.push("Forrest");
		st.push("Gump");

		/*
		Gump
		Forrest
		Sara
		Andrew
		*/
		
		st.pop(); // it will pop Gump
		
		/*
		Forrest
		Sara
		Andrew
		*/

		// checking stack status
		System.out.println("Is stack empty: "+ st.empty());
		
		// Print out  the stack
		System.out.println(st);
		
		// Print out peek
		System.out.println(st.peek());
			
	}
}