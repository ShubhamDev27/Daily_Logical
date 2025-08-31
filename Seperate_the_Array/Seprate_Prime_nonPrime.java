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
        int left = 0, right = arr.length - 1;

        while(left<right) 
        {
        	  while(left<right && isPrime(arr[left]))
        	  {
        		  left++;
        	  }
        	  while(left<right && !isPrime(arr[right])) 
        	  {
        		  right--;
        		  
        	  }
        	  if(left<right) 
        	  {
        		  int temp=arr[left];
        		  arr[left]=arr[right];
        		  arr[right]=temp;
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
