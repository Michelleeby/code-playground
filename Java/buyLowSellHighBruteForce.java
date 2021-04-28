// Given an array of integers of stock prices per day, find the best day to buy and to sell, return the profit. 
// Given [1, 5, 7, 4], the solution would be 6, buying at 1 and selling at 7.

class Solution {
    public int maxProfit(int[] prices) {
        int acc = 0;
        for (int current = 0; current < prices.length; current++) { // For each price in prices
            for (int offset = 1; offset < prices.length; offset++) { // For each price offset from price
                if (prices[current] < prices[offset]) {
                    if (acc < prices[offset] - prices[current]) {
                        acc = prices[offset] - prices[current];
                    }
                }
            }
        }
        
        return acc;
    }
}
