import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 19, 18, 25};
        
        int minDiff = findMinimumDifference(arr);
        
        System.out.println("Minimum difference is: " + minDiff);
    }

    public static int findMinimumDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        // Initialize minimum difference as a large number
        int minDiff = Integer.MAX_VALUE;
        
        // Find the minimum difference between adjacent elements
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        return minDiff;
    }
}
