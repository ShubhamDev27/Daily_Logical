package Stack_Queue_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_Queue {

	Queue<Integer> q = new LinkedList<>();
	
	public void push(int value) 
	{
		int size=q.size();
		q.add(value);
		
		//remove fisrt element and add it ot the last
		for(int i=0;i<size;i++) 
		{
			q.add(q.poll());
		}
	}
	public int pop() 
	{
		if(q.isEmpty()) 
		{
			return -1;
		}
		return q.poll();
	}
	public int top() 
	{
		if(q.isEmpty()) 
		{
			return -1;
		}
		return q.peek();
	}
	
}
