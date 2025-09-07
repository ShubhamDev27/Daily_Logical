package Level_4;

public class find_Peak_Element {

    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;  // peak lies on the right side
            } else {
                right = mid;     // peak lies on the left side or at mid
            }
        }
        return left; // or right, both point to a peak
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element index: " + peakIndex + ", value: " + arr[peakIndex]);
    }
}

