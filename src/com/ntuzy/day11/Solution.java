package com.ntuzy.day11;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 
 * @author IamZY
 *
 */
public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<Integer> innerList = null;
		List<List<Integer>> outerList = new ArrayList<List<Integer>>();

		if (numRows == 0) {
			return outerList;
		} else if (numRows == 1) {
			innerList = new ArrayList<Integer>();
			innerList.add(1);
			outerList.add(innerList);
			return outerList;
		} else if (numRows == 2) {
			innerList = new ArrayList<Integer>();
			innerList.add(1);
			outerList.add(innerList);
			innerList = new ArrayList<Integer>();
			innerList.add(1);
			innerList.add(1);
			outerList.add(innerList);
			return outerList;
		} else {
			// 从第三行开始
			// 控制的行数
			innerList = new ArrayList<Integer>();
			innerList.add(1);
			outerList.add(innerList);
			innerList = new ArrayList<Integer>();
			innerList.add(1);
			innerList.add(1);
			outerList.add(innerList);
			for (int i = 3; i <= numRows; i++) {
				innerList = new ArrayList<Integer>();
				// 控制每行的个数
				innerList.add(1);
				for (int j = 2; j <= i - 1; j++) {
					innerList.add(outerList.get(i - 2).get(j - 2) + outerList.get(i - 2).get(j - 1));
				}
				innerList.add(1);
				outerList.add(innerList);
			}
		}

		return outerList;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		List<List<Integer>> generate = solution.generate(0);
		System.out.println(generate);
	}
}
