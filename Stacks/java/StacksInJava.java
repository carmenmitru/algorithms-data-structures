import java.util.*;
/*
push(Object v) - adds an element to th stack
pop() - removes and return the top element of the stack
peek() - return the top element of the stack
isEmpty() - check if stack is empty

*/
class Solution {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>(); // stack will contain elements of type Integer
		for(int i = 0; i<=4; i++){
			st.push(i);// push  0 1 2 3 4 in the stack
		}
		System.out.println(st);// display the stack
		System.out.println("Is stack empty " + st.isEmpty());
		
		int top = st.peek();// return the top element of the stack 
		System.out.println("Top of the stack is " + top);
		
		
		st.pop();//pop top element of the stack without removing it
		System.out.println(st);
	}
}
