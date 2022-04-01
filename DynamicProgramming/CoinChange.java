class CoinChange {
    static Integer[] dp = null;
    // static public int coinChange(int[] coins, int amount) {
    //     if(amount < 0) return Integer.MAX_VALUE;
    //     if (amount == 0)
    //         return 0;
    //     int min = Integer.MAX_VALUE;
    //     for (int c : coins) {
    //         int coin = coinChange(coins, amount - c);
    //         if(coin != Integer.MAX_VALUE)
    //             min = Math.min(coin + 1, min);
    //     }
    //     return min;
    // }
    static public int coinChange(int[] coins, int amount) {
        dp = new Integer[amount + 1];

        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            int result = Integer.MAX_VALUE;
            for (int c : coins) {
                if(i-c >= 0) result = dp[]
            }
        }

    }
    public static void main(String[] args) {
        System.out.println(coinChange(new int[] { 1, 2, 5 }, 11));
    }
}