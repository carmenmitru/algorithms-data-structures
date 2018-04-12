import java.util.*;
class Solution{
	public static int evalRPN(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
		Stack < String > stack = new Stack < String > ();
		for (String t: tokens) {
		 if (!operators.contains(t)) { //push to stack if it is a number
			stack.push(t);
	     }  else {
			 	/* 
			   1. pop numbers from stack if it is an operator 
			   2. calculate the result and push it to the stack for next operations
				*/
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				if(t == "+") {
					stack.push(String.valueOf(a + b));
				} else if(t == "-") {
					stack.push(String.valueOf(b - a));
				} else if(t == "*") {
					stack.push(String.valueOf(a * b));
				} else if(t == "/") {
					stack.push(String.valueOf(a * b));
				} 
			}
		}
		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	 }
	public static void main(String args[]){
		String[] polishExpr = new String[]{"2", "1", "+", "3", "*"};
		System.out.println(evalRPN(polishExpr));
	}
}
