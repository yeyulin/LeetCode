package com.dynamic;

/**
 * @Function 买卖股票的最佳时机
 * @author yeyulin
 * @data 2018/07/10
 *
 */
public class Two {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] - prices[i] > result) {
					result = prices[j] - prices[i];
				}
			}
		}
		return result;
	}

	public int maxProfit2(int[] prices) {
		int max = 0;
		if (prices == null || prices.length == 0) {
			return max;
		}

		int min = prices[0];

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
				continue;
			}
			if (max < prices[i] - min) {
				max = prices[i] - min;
			}

		}
		return max;
	}

}
