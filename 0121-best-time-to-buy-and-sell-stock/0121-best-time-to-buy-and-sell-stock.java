class Solution {
        // Single-pass
        // Time complexity O(n)
        // Space complexity O(1)
        public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Calculate profit
            }
        }

        return maxProfit;
    }

    // Kadane's Algorithm
    // Time complexity O(n)
    // Space complexity O(1)
    public int maxProfit2(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            currentProfit = Math.max(0, currentProfit + diff);
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }


    // Brute force - Nested Loops
    // Time complexity O(n^2)
    // Space complexity O(1)
    public int maxProfit3(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length-1; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;      
    }
}