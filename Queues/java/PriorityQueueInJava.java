import java.util.*;

class Solution{
	public static void main(String[] args)
	{
		Comparator<Integer> comparator = new IntegerComparator();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10, comparator);
		// Elements will be inserted in the queue in ascending order
		queue.add(5);
		queue.add(1);
		queue.add(9);
		queue.add(2);
		
		while (queue.size() != 0)
		{
			System.out.println(queue.remove()); // it will print  1 2 5 9
		}
	}
}



class IntegerComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer  x, Integer y)
	{
	
		if (x < y)
		{
			return -1;
		}
		if (x > y)
		{
			return 1;
		}
		return 0;
	}
}