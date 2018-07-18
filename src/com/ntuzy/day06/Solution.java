package com.ntuzy.day06;

import java.util.Arrays;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 
 * @author IamZY
 *
 */
public class Solution {

	public int removeElement(int[] nums, int val) {
		if(nums.length==0) {
			return 0;
		}
		int tempLength = nums.length;
		for (int i = 0; i < tempLength;) {
			if (nums[i] != val) {
				i++;
			} else {
				for (int j = i; j < tempLength - 1; j++) {
					nums[j] = nums[j + 1];
				}
				tempLength--;
			}
//			System.out.println("i: " + i + Arrays.toString(nums));
		}
		return tempLength;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.removeElement(new int[] { 3, 2, 2, 3 }, 5));
//		System.out.println(solution.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
	}
}
