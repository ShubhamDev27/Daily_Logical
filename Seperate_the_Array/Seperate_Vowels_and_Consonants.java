package Seperate_the_Array;

import java.util.Arrays;

public class Seperate_Vowels_and_Consonants {
     public static void main(String[] args) {
         char arr[] = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'z', 'm', 'n'};
         
         int start =0;int end=arr.length-1;
         while(start<=end) 
         {
        	    while(start <= end && isVowels(arr[start])) 
        	    {
        	    	  start++;
        	    }
        	    while(start <= end && !isVowels(arr[end]))
        	    {
        	    	  end--;
        	    }
        	    if(start<end) 
        	    {
        	    	  char temp=arr[start];
        	    	  arr[start]=arr[end];
        	    	  arr[end]=temp;
        	    	  start++;
        	    	  end--;
        	    }
         }
         System.out.println(Arrays.toString(arr));
     	}
     public static boolean isVowels(char ch) 
     {
    	   ch = Character.toLowerCase(ch);
    	    return (ch =='a' ||ch =='e'||ch =='i'||ch =='o'||ch =='u');
     }
}
