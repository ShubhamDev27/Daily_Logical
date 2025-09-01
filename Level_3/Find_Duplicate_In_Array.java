package GFG_Level_3;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_In_Array {
  public static void main(String[] args) {
      int arr[] = {2, 15, 15, 18, 4, 21, 11, 21, 4, 9};

	Set<Integer> seen = new HashSet<>();
	Set<Integer> duplicate = new HashSet<>();

	for(int num:arr) 
	{
		if(!seen.add(num)) 
		{
			duplicate.add(num);
		}
	}
	System.out.println("Duplicates are"+duplicate);
  }
}
