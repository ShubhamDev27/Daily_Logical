package MyPack;

import java.util.Scanner;
import java.util.Stack;

public class Evaluation_of_Prefix
{
	static int _prefix(String prefix) 
	{
		Stack<Integer> stack=new Stack<>();
		for(int i=prefix.length()-1;i>=0;i--) 
		{
			char c =prefix.charAt(i);
			if(Character.isDigit(c)) 
			{
                stack.push(c - '0');
			}
			else 
			{
				int opr1=stack.pop();
				int opr2 = stack.pop();
				
				switch(c) 
				{
				case '+':
					stack.push(opr1+opr2);
					break;
				case '-':
					stack.push(opr1-opr2);
					break;
				case '*':
						stack.push(opr1*opr2);
						break;
				case '/':
						stack.push(opr1/opr2);
						break;
				case '%':
					stack.push(opr1%opr2);
					break;
				default:
					System.out.println("invalid operator!"+c);
				    return -1;			
				}
				
			}
		}
		return stack.pop();

		
	}
   public static void main(String[] args)
   {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter prefix expression :");
	 String prefix = sc.next();
	 int result =_prefix(prefix);
	 System.out.println("evaluation of prefix is:"+result);
	 
   } 
 }