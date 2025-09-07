package Level_4;

import java.util.Arrays;

public class Find_Repeating_And_Missing {

    public static int[] findTwoNumbers(int[] nums) {
        long n = nums.length;
        long expectedSum = (n * (n + 1)) / 2;
        long expectedSumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6;

        long actualSum = 0;
        long actualSumOfSquares = 0;
        for (int num : nums) {
            actualSum += num;
            actualSumOfSquares += (long)num * num;
        }

        long diff = actualSum - expectedSum;
        long sq_diff = actualSumOfSquares - expectedSumOfSquares;
        
        long sum = sq_diff / diff;
    
        long repeating = (sum + diff) / 2;
        
        long missing = (sum - diff) / 2;

        return new int[]{(int)repeating, (int)missing};
    }


    public static void main(String[] args) {
       
        int[] input1 = {3, 1, 3};
        int[] expected1 = {3, 2}; // Repeating: 3, Missing: 2
        int[] actual1 = findTwoNumbers(input1);
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Expected Output (Repeating, Missing): " + Arrays.toString(expected1));
        System.out.println("Actual Output:   " + Arrays.toString(actual1));
        System.out.println("Test Passed: " + Arrays.equals(expected1, actual1));
        System.out.println("---------------------------------");

        // Test Case 2
        int[] input2 = {4, 3, 6, 2, 1, 1};
        int[] expected2 = {1, 5}; // Repeating: 1, Missing: 5
        int[] actual2 = findTwoNumbers(input2);
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Expected Output (Repeating, Missing): " + Arrays.toString(expected2));
        System.out.println("Actual Output:   " + Arrays.toString(actual2));
        System.out.println("Test Passed: " + Arrays.equals(expected2, actual2));
        System.out.println("---------------------------------");
        
        // Test Case 3
        int[] input3 = {1, 2, 2, 4};
        int[] expected3 = {2, 3}; // Repeating: 2, Missing: 3
        int[] actual3 = findTwoNumbers(input3);
        System.out.println("Input: " + Arrays.toString(input3));
        System.out.println("Expected Output (Repeating, Missing): " + Arrays.toString(expected3));
        System.out.println("Actual Output:   " + Arrays.toString(actual3));
        System.out.println("Test Passed: " + Arrays.equals(expected3, actual3));
        System.out.println("---------------------------------");
        
        // Test Case 4
        int[] input4 = {2, 2};
        int[] expected4 = {2, 1}; // Repeating: 2, Missing: 1
        int[] actual4 = findTwoNumbers(input4);
        System.out.println("Input: " + Arrays.toString(input4));
        System.out.println("Expected Output (Repeating, Missing): " + Arrays.toString(expected4));
        System.out.println("Actual Output:   " + Arrays.toString(actual4));
        System.out.println("Test Passed: " + Arrays.equals(expected4, actual4));
        System.out.println("---------------------------------");
    }
}
