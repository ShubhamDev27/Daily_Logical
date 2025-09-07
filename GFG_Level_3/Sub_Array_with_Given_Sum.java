package GFG_Level_3;

import java.util.*;

public class Sub_Array_with_Given_Sum {
    public static void findSubarray(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == target) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }

            if (map.containsKey(currSum - target)) {
                System.out.println("Subarray found from index " + (map.get(currSum - target) + 1) + " to " + i);
                return;
            }

            map.put(currSum, i);
        }
        System.out.println("No subarray found with given sum");
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, -2, -20, 10};
        int target =-12;
        findSubarray(arr, target);
    }
}

