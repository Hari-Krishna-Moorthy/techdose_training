import java.util.Arrays;

public class KnapSnack {

    /*
    public static int knapsnack(int[] weight, int[] profits, int W, int n) {
        if (n == 0 || W == 0)
            return 0;
        if (weight[n - 1] > W)
            return knapsnack(weight, profits, W, n - 1);
        return Math.max(
                knapsnack(weight, profits, W, n - 1),
                profits[n - 1] + knapsnack(weight, profits, W - weight[n - 1], n - 1)
        );
    }
    */

    static int[][] memo = null;

    public static int knapsnack(int[] weight, int[] profits, int W, int n) {
        if (W == 0 || n == 0)
            return 0;
        if (memo[n][W] != -1)
            return memo[n][W];
        if (weight[n - 1] > W)
            memo[n][W] =  knapsnack(weight, profits, W, n - 1);
        else
            memo[n][W] = Math.max(
                knapsnack(weight, profits, W, n - 1),
                profits[n - 1] + knapsnack(weight, profits, W - weight[n - 1], n - 1)
            );
        return memo[n][W];
    }
    
    public static void main(String[] args) {
        int[] profits = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int W = 50;
        memo = new int[profits.length + 1][W + 1];
        for (int i = 0; i <= profits.length; i++)
            Arrays.fill(memo[i], -1);
        System.out.println(knapsnack(weight, profits, W, weight.length));
    }
}