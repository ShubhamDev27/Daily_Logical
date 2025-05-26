package Logic;

public class HCF_LCM 
{
	public static int check(int a,int b) 
	{
		int temp=0;
		if(a>b) 
		{
			while(a!=temp) 
			{
				temp= a-b;
				a = temp-b;
				b=temp-a;
			}
			return temp;			

		}
		return 0;
	}
	public static void main(String[] args)
	{
		int a = HCF_LCM.check(36, 12);
		System.out.println(a);
	}

}
