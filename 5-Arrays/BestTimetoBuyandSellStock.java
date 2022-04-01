public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int max = 0, buy = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[buy] > prices[i])
                buy = i;
            max = Math.max(max, prices[i] - prices[buy]);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }
}