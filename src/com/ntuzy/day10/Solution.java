package com.ntuzy.day10;

import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 
 * @author IamZY
 *
 */
public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int i = 0; i < nums1.length; i++) {
			if (i >= m) {
				nums1[i] = nums2[n - (nums1.length - i)];
			}
		}

//		Arrays.sort(nums1);
		
		
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 1; j < nums1.length - i; j++) {
				if (nums1[j - 1] > nums1[j]) {
					int temp = nums1[j - 1];
					nums1[j - 1] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums1));
	}
	

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.merge(new int[] { 4, 0, 0, 0, 0, 0 }, 1, new int[] { 1, 2, 3, 5, 6 }, 5);
		solution.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
		solution.merge(new int[] { 0 }, 0, new int[] { 1 }, 1);

	}

}
