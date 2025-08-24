package Level_1;

import java.util.Scanner;

public class find_highest_from_3_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three num: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
  
		int result= (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println("the highest num is "+result);
		
	}

}
