package com.ntuzy.day12;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 
 * @author IamZY
 *
 */
public class Solution {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> innerList = null;
		List<List<Integer>> outerList = new ArrayList<List<Integer>>();

		if (rowIndex < 0) {
			innerList = new ArrayList<Integer>();
			return innerList;
		} else if (rowIndex == 0) {
			innerList = new ArrayList<Integer>();
			innerList.add(1);
			return innerList;
		} else if (rowIndex == 1) {
			innerList = new ArrayList<Integer>();
			innerList.add(1);
			innerList.add(1);
			return innerList;
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
			for (int i = 2; i <= rowIndex; i++) {
				innerList = new ArrayList<Integer>();
				// 控制每行的个数
				innerList.add(1);
				for (int j = 1; j <= i - 1; j++) {
					innerList.add(outerList.get(i - 1).get(j - 1) + outerList.get(i - 1).get(j));
				}
				innerList.add(1);
				outerList.add(innerList);
			}

		}

		return outerList.get(rowIndex);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		List<Integer> row = solution.getRow(33);
		System.out.println(row);
	}
}
