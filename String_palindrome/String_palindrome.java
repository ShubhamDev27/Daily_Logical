package Logic;

public class String_palindrome {
	
	public static void check(String str) 
	{
		 String temp="";
		 String og = str;
		 for(int i= str.length()-1;i>=0;i--) 
		 {
			 temp=temp+str.charAt(i);
			 
		 }
		if(og.equalsIgnoreCase(temp)) 
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		String str = "nitin";
		check(str);
	}
}
