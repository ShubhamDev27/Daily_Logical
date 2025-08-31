package Seperate_the_Array;

import java.util.*;

public class Odd_Even_Seperate_Single_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int result[] = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = 9;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 != 0) {
                result[left++] = arr[i]; // odd -> left
            } else {
                result[right--] = arr[i]; // even -> right
            }
        }

        System.out.println("Odd first, Even last: " + Arrays.toString(result));
        sc.close();
    }
}


// if the question is to use single loop then use this aproach