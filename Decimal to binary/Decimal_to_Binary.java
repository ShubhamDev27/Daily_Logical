package MyPack;

import java.util.Scanner;
import java.util.Stack;

public class Decimal_to_Binary
{
	
	static void bin(int num) 
	{
		int b;
		Stack<Integer> stack =new Stack<>();
		if (num == 0) {
			System.out.print("0");
			return;
		}
		while(num>0) 
		{
			b=num%2;
			stack.push(b);	
			num=num/2;
		}
		while(!stack.isEmpty()) 
		{
			System.out.print(stack.pop());
		}	}
public static void main(String[] args)
  {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter num for bin:");
	int num=sc.nextInt();
	bin(num);
  }
}
