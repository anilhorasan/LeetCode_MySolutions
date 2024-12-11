class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int len = prices.length;
        int price_ifSoldToday = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++){
            if(prices[i] < min) min = prices[i];
            price_ifSoldToday = prices[i] - min;
            if(maxProfit < price_ifSoldToday) maxProfit = price_ifSoldToday;
        }
        return maxProfit;
    }

    public int maxVal(int[] input, int start, int end){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = start; i <= end; i++){
            if(input[i] > max) {
               max = input[i]; 
               maxIndex = i;
            }
        }
        return maxIndex;
    }
    public int minVal(int[] input, int start, int end){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = start; i <= end; i++){
            if(input[i] < min) {
               min = input[i]; 
               minIndex = i;
            }
        }
        return minIndex;
    }
}