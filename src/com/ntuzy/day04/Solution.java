package com.ntuzy.day04;

/**
 * 罗马数字转整数
 * 
 * @author IamZY
 *
 */
public class Solution {
	public int romanToInt(String s) {
		int sum = 0;
		char[] chars = s.toCharArray();

		if (s.contains("IV") || s.contains("IX") || s.contains("XL") || s.contains("XC") || s.contains("CD")
				|| s.contains("CM")) {
			for (int i = 0, j = 1; j <= chars.length;) {

				if(j==chars.length) {
					sum += roman(String.valueOf(chars[chars.length-1]));
					return sum;
				}
				
				
				if (roman(String.valueOf(chars[i])) < roman(String.valueOf(chars[j]))) {
					sum += roman(String.valueOf(chars[i]) + String.valueOf(chars[j]));
					i += 2;
					j += 2;
					System.out.println("sum1 " + sum + "i " + i + "j " + j);
				} else {
					sum += roman(String.valueOf(chars[i]));
					i++;
					j++;

					System.out.println("sum2 " + sum + "i " + i + "j " + j);
				}

			}
		} else {
			for (int i = 0; i < chars.length; i++) {
				sum += roman(String.valueOf(chars[i]));
			}
		}

		return sum;
	}

	public int roman(String s) {
		System.out.println("s " + s);
		int num = 0;
		if (s.equals("IV") || s.equals("IX") || s.equals("XL") || s.equals("XC") || s.equals("CD") || s.equals("CM")) {
			num = s.equals("IV") ? 4
					: s.equals("IX") ? 9
							: s.equals("XL") ? 40
									: s.equals("XC") ? 90 : s.equals("CD") ? 400 : s.equals("CM") ? 900 : 0;
		} else {
			num = s.equals("I") ? 1
					: s.equals("V") ? 5
							: s.equals("X") ? 10
									: s.equals("L") ? 50
											: s.equals("C") ? 100 : s.equals("D") ? 500 : s.equals("M") ? 1000 : 0;
		}

		return num;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		// System.out.println(solution.roman("CM"));
		System.out.println(solution.romanToInt("MCMXCIV"));
	}
}
