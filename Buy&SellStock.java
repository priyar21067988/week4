public class Solution {

    public static int maxProfit(int[] prices) {
        int minPriceSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPriceSoFar) {
                minPriceSoFar = prices[i];
            } else {
                int profitToday = prices[i] - minPriceSoFar;
                if (profitToday > maxProfit) {
                    maxProfit = profitToday;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices1)); // 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2)); // 0
    }
}
