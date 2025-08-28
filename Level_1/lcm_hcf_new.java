package Logic;

import java.util.Scanner;

public class lcm_hcf_new
{
    public static int HCF(int a,int b) 
    {
    	while(b!=0) 
    	{
    		int temp = b;
    		b = a % b ;
    		a = temp;
    	}
    	return a;
    }
    public static int LCM(int a,int b) 
    {
    	int Lcm = (a*b)/HCF(a,b);
    	return Lcm;
    }
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int HCF = HCF(a,b);
		int LCM = LCM(a,b);
		System.out.println("HCF IS:"+HCF);
		System.out.println("LCM IS:"+LCM);
		
	
	}
   }


