package com.ntuzy.day09;

import java.util.Arrays;

/**
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。 你可以假设除了整数0
 * 之外，这个整数不会以零开头。
 * 
 * @author IamZY
 *
 */
public class Solutioon {
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			System.out.println(digits[i]);
			// 如果最后一位数加1等于10 需要进位
			if ((digits[i] + 1) == 10) {
				digits[i] = 0;
				
				// 如果遍历到最高为还是等于10
				if (i == 0) {
					int[] newDigits = new int[digits.length + 1];
					newDigits[0] = 1;
					return newDigits;
				}

				continue;
			} else {
				digits[i] += 1;
				break;
			}
		}

	

		return digits;
	}

	public static void main(String[] args) {
		Solutioon solutioon = new Solutioon();
		System.out.println(Arrays.toString(solutioon.plusOne(new int[] { 0 })));
	}
}
