//package Logic;
//
//import java.util.Scanner;
//
//public class Reverse_Array_Optimized 
//{
//	public static void check(int[] arr) 
//	{
//		int temp=0;
//		for(int i =arr.length-1;i>=0;i--) 
//		{
//			 temp = arr[i];
//			 
//			
//		}
//	}
//	public static void main(String[] args)
//	{
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter size of array:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//
//		System.out.println("Enter"+n+"numbers:");
//		for(int i=0;i<n;i++) 
//		{
//			arr[i]=sc.nextInt();
//		}
//		check(arr);
//	}
//
//}
//
//
//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//
//        // Print original array
//        System.out.print("Original array: ");
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//
//        // Reverse the array manually
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            // Swap elements
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//
//        // Print reversed array
//        System.out.print("\nReversed array: ");
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//    }
//}
//
