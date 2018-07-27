package com.ntuzy.day15;

import java.util.Arrays;

/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。 函数应该返回这两个下标值 index1 和 index2，其中 index1
 * 必须小于 index2。
 * 
 * @author IamZY
 *
 */
public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];

		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			if (numbers[left] + numbers[right] == target) {
				res[0] = left + 1;
				res[1] = right + 1;
				break;
			} else if (target < numbers[right] + numbers[left]) {
				right--;
			} else {
				left++;
			}
			
		}

		return res;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.twoSum(new int[] { 2, 7, 11, 15 }, 9)));
	}

}
