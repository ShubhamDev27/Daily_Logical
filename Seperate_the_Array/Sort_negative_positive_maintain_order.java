package Seperate_the_Array;

import java.util.*;

public class Sort_negative_positive_maintain_order {
    public static void main(String[] args) {
        int arr[] = {-19, 54, 24, -35, -6, -9, 55};
        
        // Create two lists
        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();
        
        // Separate while maintaining order
        for (int num : arr) {
            if (num < 0) negatives.add(num);
            else positives.add(num);
        }
        
        // Merge back
        negatives.addAll(positives);
        
        // Convert back to array
        int[] result = negatives.stream().mapToInt(i -> i).toArray();
        
        System.out.println(Arrays.toString(result));
    }
}

