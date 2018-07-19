package com.ntuzy.day07;


/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 你可以假设数组中无重复元素。
 * 
 * @author IamZY
 *
 */
public class Solution {

	public int searchInsert(int[] nums, int target) {
		int index = 0;
		if (nums.length == 0) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}

		// 没找到
		if (index == 0 && target < nums[nums.length - 1]) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] < target && target < nums[i + 1]) {
					index = i + 1;
				}
			}
		} else {
			index = nums.length;
		}

		return index;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
	}
}
