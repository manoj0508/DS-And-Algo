package org.manoj.problem.problem;

/**
 You are given an array prices where prices[i] is the price of a given stock on the ith day.
 You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 Input: prices = [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

 */
public class BestTimeToBuyStock {

    public static void main(String[] args) {
        //int[] input = {7, 1, 5, 3, 6, 4};
         int [] input = {7,6,4,3,1};
        System.out.println("best Solution : " + maxProfit(input));

        System.out.println("brut force solution : " + brutForceSolution(input));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0, buy = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);

            int profit = prices[i] - buy;
            maxProfit = Math.max(profit, maxProfit);


        }
        return maxProfit;
    }

    public static int brutForceSolution(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                int profit = sell - buy;

                maxProfit = Math.max(profit, maxProfit);

            }

        }

        return maxProfit;
    }

}
