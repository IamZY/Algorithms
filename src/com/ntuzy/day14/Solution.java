package com.ntuzy.day14;


/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 
 * @author IamZY
 *
 */
public class Solution {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}

		/*
		 * for (x = 0; x < prices.length; x++) { for (y = x + 1; y < prices.length; y++)
		 * { System.err.println("x= " + x + " y= " + y);
		 * System.out.println("--------------------------------------------"); maxProfit
		 * = maxProfit > returnTempMaxPrice(x, y, prices) ? maxProfit :
		 * returnTempMaxPrice(x, y, prices);
		 * System.out.println("--------------------------------------------"); //
		 * System.out.println(returnTempMaxPrice(x, y, prices)); } }
		 * 
		 * System.out.println("maxProfit= " + maxProfit); // maxProfit = maxProfit >
		 * tempPrice ? maxProfit : tempPrice;
		 */
		return maxProfit;
	}


	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(solution.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		System.out.println(solution.maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(solution.maxProfit(new int[] { 6, 1, 3, 2, 4, 7 }));
	}
}
