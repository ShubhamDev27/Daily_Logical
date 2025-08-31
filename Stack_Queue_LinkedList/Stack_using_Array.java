package Stack_Queue_LinkedList;

public class Stack_using_Array {

	class Stack
	{
		private int maxSize;
		private int [] StackArray;
		private int top;
		
		public Stack(int size) 
		{
			maxSize=size;
			StackArray=new int[maxSize];
			top=-1;			
		}
		
		public void push(int value) 
		{
			if(top<maxSize-1) 
			{
				StackArray[--top]=value;
			}
			else 
			{
				System.out.println("Stack overflow !");
			}
		}
		public int pop() 
		{
			if(top>=0) 
			{
				return StackArray[top--];
			}
			else 
			{
				System.out.println("Stack underflow !");
				return -1;
			}
		}
		public int peek() 
		{
			if(top>=0) 
			{
				return StackArray[top];
			}
			else 
			{
				System.out.println("Stack underflow !");
				return -1;
			}
		}
		public boolean isEmpty() 
		{
			return top==-1;
		}
	}
}
