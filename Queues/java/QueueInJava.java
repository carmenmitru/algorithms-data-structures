import java.util.*;
/*
Queue is an interface so you can't instantiate so  you'll have to instantiate one of its implementing classes: 
1) as Linked List
2) as Priority Queue 
- add(element)
- peek() - returns the element (does not remove it)
- remove() - remove and returns the head of the queue
*/
class Solution {
	public static void main(String[] args) {
		// create queue that will contain Integer elements
		Queue<Integer> q = new LinkedList<Integer>();
		 
		// Adds elements {1, 2, 3, 4} to queue
		for (int i=1; i<=4; i++){
			q.add(i);
		}
		 	
		// Display content of the queue.
		System.out.println("Elements of queue " + q);
	 
		// To remove the head of queue.
		int removedEl = q.remove();
		System.out.println("Head element that was removed" + removedEl);
	 	
		// Queue after the head removal
		System.out.println(q);
	 
		// To view the head of queue
		int head = q.peek();
		System.out.println("Head of queue " + head);
	 
		System.out.println(q);
		
		//Size of the queue
		int size = q.size();
		System.out.println("Size of queue " + size);			
	}
}
