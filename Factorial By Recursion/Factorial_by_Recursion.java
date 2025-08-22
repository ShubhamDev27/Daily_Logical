package Level_1;

public class Factorial_by_Recursion {
	
	static int fact(int n) 
	{
		if (n==1 || n==0) 
		{
			return 1;
		}
		return n*fact(n-1);
	}
   public static void main(String[] args) {
	 
	   int a = 5;
	   
	  int fact = fact(a);
	  System.out.println("Factorial is :"+fact);
  }
}
