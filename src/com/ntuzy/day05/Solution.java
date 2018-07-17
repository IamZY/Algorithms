package com.ntuzy.day05;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。 
 * 假设输入的数组为nums =[0,0,1,1,1,2,2,3,3,4]
 * 第一次比对 [0, 1, 1, 1, 2, 2, 3, 3, 4, 4]
 * 第二次比对 [0, 1, 2, 2, 3, 3, 4, 4, 4, 4] 
 * 第三次比对 [0, 1, 2, 3, 3, 4, 4, 4, 4, 4] 
 * 第四次比对 [0, 1, 2, 3, 4, 4, 4, 4, 4, 4] 
 * legnth = 5
 * 
 * @author IamZY
 *
 */
public class Solution {
	public int removeDuplicates(int[] nums) {
		// 判断传入的数组是否为空
		if(nums.length==0) {
			return 0;
		}
		
		int temp = 0, tempLength = 0, length = 1, offset = 0; // offset 为偏移量
		temp = nums[0];
		tempLength = nums.length;
		for (int i = 1; i < tempLength; i++) {
			if (temp == nums[i]) {
				// 当比对相同的时候 偏移量+1
				offset++;
			} else {
				length++;
				// 后面所有位置的数字都向前移动多少个偏移量的位置
				for (int j = i; j < nums.length; j++) {
					nums[j - offset] = nums[j];
				}
				i -= offset;
				// 新的比对数为 两个不同的数
				temp = nums[i];
				tempLength -= offset;
				// 偏移量置零 重新开始新一轮的循环
				offset = 0;
			}
		}
		return length;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
//		System.out.println(solution.removeDuplicates(new int[] { 1, 1, 2, 3 }));
		System.out.println(solution.removeDuplicates(new int[] { }));
		// System.out.println(solution.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2,
		// 3, 3, 4 }));
	}
}
