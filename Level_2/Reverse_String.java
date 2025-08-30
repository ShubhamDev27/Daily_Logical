package Level_2;

public class Reverse_String {

	static String Reverse1(String str) 
	{
		char chars[] =str.toCharArray();
		int left =0,right=chars.length-1;
		while(left<right) 
		{
			char temp=chars[left];
			chars[left]=chars[right];
			chars[right]=temp;
			left++;
			right--;
		}
		return new String(chars);
	}
	public static void main(String[] args) {
		String str ="hello world";
		String str1 = "Java";
		String str2 = "Shubham";
		System.out.println("Reverse string is "+Reverse1(str));
		System.out.println("Reverse string is "+Reverse2(str1));
		System.out.println("Reverse string is "+reverse3(str2));			
	}
	
	static String Reverse2(String str1) 
	{
		return new StringBuilder(str1).reverse().toString();
	}
	
	static String reverse3(String str2) 
	{
		String str3="";
		
		for(int i=str2.length()-1;i>=0;i--) 
		{
		          str3+=str2.charAt(i);
		}
		return str3;
	}
}
