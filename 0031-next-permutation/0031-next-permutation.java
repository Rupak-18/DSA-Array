import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no such element is found, reverse the array
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the element just larger than nums[ind]
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                // Step 4: Swap the elements
                swap(nums, i, ind);
                break;
            }
        }

        // Step 5: Reverse the subarray to the right of ind
        reverse(nums, ind + 1, n - 1);
    }

    // Helper function to reverse a subarray
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Helper function to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
