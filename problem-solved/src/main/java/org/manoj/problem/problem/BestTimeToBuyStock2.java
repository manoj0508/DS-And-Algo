package org.manoj.problem.problem;

public class BestTimeToBuyStock2 {

    public static void main(String[] args) {

        int[] prices = {1,2,3,4,5};
        System.out.println("Max profit " + maxProfit(prices));
    }

    /**
     * brut force way
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int buy = prices[0], sell = 0, profit = 0;

        for (int i = 1; i < prices.length; i++) {

            while (i < prices.length && prices[i] < prices[i - 1]) {
                if (i < prices.length - 1) {
                    i++;
                } else {
                    break;
                }
            }
            if (buy > prices[i-1]) {
                buy = Math.min(buy, prices[i]);
            } else {
                sell = Math.max(prices[i], prices[i - 1]);
                profit += sell - buy;
                buy = prices[i];
            }

        }

        return profit;
    }

    /**
     * more cleaner code
     * @param prices
     * @return
     */
    public static int maxProfit1(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
