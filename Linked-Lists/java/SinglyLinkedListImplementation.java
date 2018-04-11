import java.util.*;

/*
 1. Create a Node Class with 2 field s: 
	 - data
	 - next pointer
 2. Create a LinkedList Class with methods :
	- push node in front of the list 
	- push node at the end of the list
	- search element in a list (iterative/recursive)
	- get length of the list (iterative/recursive)
	- display the list
*/
class Node
{
	public int data;
	public Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class LinkedList {
	Node head;
	public void pushFront(int element){
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
	}
	public void pushBack(int element){
		Node new_node = new Node(element);
		if (head == null)
		{
			head = new Node(element);
			return;
		}
		Node last = head; 
		while (last.next != null)
			last = last.next;
	
		last.next = new_node;
		return;
	}
	public boolean searchElementIterative(int element){
		Node current = head;   
		while (current != null)
		{
			if (current.data == element)
				return true;  
			current = current.next;
		}
		return false;    
	}
	public boolean searchElementRecursive(Node head,int element){
		
		if (head == null)
					return false;

		if (head.data == element)
			return true;
 
		return searchElementRecursive(head.next, element);
	}
	public int getLengthListIterative(){
		Node temp = head;
		int l = 0;
		while (temp != null){
			l++;
			temp = temp.next;
		}
		return l;
	}
	public int getLengthRecursive(Node node){
		if(node == null){
			return 0;
		}
		return 1 + getLengthRecursive(node.next);
	}
	public void displayList(){
		Node list = head;
		while(list != null){
			System.out.println(list.data + " ");
			list = list.next;
		}
	}
	public static void main(String[] args) {
			LinkedList list = new LinkedList();
			list.pushBack(2);
			list.pushBack(3);
			list.pushBack(4);
			list.pushFront(1);
			list.displayList();
			System.out.println("Is  element 3  in the list " + list.searchElementIterative(3));
			System.out.println("Is element 5 in the list " + list.searchElementRecursive(list.head,3));
			System.out.println("Length of the list iterative " + list.getLengthListIterative());
			System.out.println("Length of the list recursive " + list.getLengthRecursive(list.head));
	}
}