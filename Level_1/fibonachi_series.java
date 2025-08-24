package Level_1;

import java.util.Scanner;

public class fibonachi_series {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
	   System.out.println("Enter num to :");
		int num = sc.nextInt();
		
		int a =0;
		int b=1;
		System.out.print("0"+","+"1"+",");
		for(int i=2;i<num;i++) 
		{
			int c =a+b;
            System.out.print(c+",");
            a=b;
            b=c;
		}
}
}
