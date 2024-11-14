package com.example;

public class Solution {

    //binary search algorithm
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If target is not found, left is the insert position
        return left;
    }
}
 class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 9;

        System.out.println(solution.searchInsert(nums, target));
    }
}
