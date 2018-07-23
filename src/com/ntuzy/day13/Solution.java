package com.ntuzy.day13;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。 如果你最多只允许完成一笔交易（即买入和卖出一支股票）
 * 设计一个算法来计算你所能获取的最大利润。 注意你不能在买入股票前卖出股票。
 * 
 * @author IamZY
 *
 */
public class Solution {
	public int maxProfit(int[] prices) {
		int maxPrice = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i; j < prices.length; j++) {
				if (prices[i] < prices[j]) {
					int price = prices[j] - prices[i];
					maxPrice = maxPrice < price ? price : maxPrice;
				}
			}
		}
		return maxPrice;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		// int maxProfit = solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }); // 5
		int maxProfit = solution.maxProfit(new int[] { 7, 6, 4, 3, 1 }); // 5
		System.out.println(maxProfit);
	}
}
