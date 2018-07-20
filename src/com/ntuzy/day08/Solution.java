package com.ntuzy.day08;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * @author IamZY
 *
 */
public class Solution {
	public int maxSubArray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int maxSum = nums[0];
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int k = i; k < nums.length; k++) {
				sum += nums[k];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
			sum = 0;
		}

		return maxSum;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		// solution.maxSubArray(new int[] { 1, 3, -1, 0 });
		System.out.println(solution.maxSubArray(new int[] {-1}));
	}
}
