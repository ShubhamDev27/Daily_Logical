package Seperate_the_Array;

import java.util.Arrays;

public class Seprate_Prime_nonPrime {

    public static void main(String[] args) {
        int arr[] = {2, 15, 3, 18, 7, 20, 11, 21, 4, 9};

        separatePrimeNonPrime(arr);

        System.out.println("Array after separating Prime and Non-Prime: " + Arrays.toString(arr));
    }

    // Method to separate prime and non-prime numbers
    public static void separatePrimeNonPrime(int[] arr) {
        int start = 0, end = arr.length - 1;

        while(start<end) 
        {
        	  while(start<end && isPrime(arr[start]))
        	  {
        		  start++;
        	  }
        	  while(start<end && !isPrime(arr[end])) 
        	  {
        		  end--;
        		  
        	  }
        	  if(start<end) 
        	  {
        		  int temp=arr[start];
        		  arr[start]=arr[end];
        		  arr[end]=temp;
        		  start++;
        		  end--;
        	  }
        }
        
    }

    // Helper method to check prime number
    public static boolean isPrime(int n) {
    	  if(n<=1) return false;
    	  
    	  for(int i=2;i*i<=n;i++) 
    	  {
    		  if(n%i==0)return false;
    	  }
    	  return true;
    }

}
