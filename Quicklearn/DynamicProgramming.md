# Dynamic Programming



## 01. Catalan Number

```
private static Integer[] catalanNum = null;

	public static int catalan_number(int n) {
		catalanNum = new Integer[n+1];
		catalanNum[0] = catalanNum[1] = 1;

		for(int i=2;i<=n;i++) {
			catalanNum[i] = 0;
			for(int j=0;j<i;j++) {
				catalanNum[i] += catalanNum[j] * catalanNum[i-j-1];
			}
		}
		return catalanNum[n];
	}

```

# 02. Subset sum problem 

```
/* 
		1) Set of Non negative numbers 
		2) Sum value

		Find :- If there exist a subset in our given set 
				Sum of elements = Sum value
*/

	private static Boolean[][] dp = null;

	public static boolean isSSum(int[] arr, int sum) {
		dp = new Boolean[arr.length + 1][sum+1];

		for(int i=0;i<arr.length;i++) 
			dp[i][0] = true;

		for(int j=0;j<=sum;j++)
			dp[0][j] = false;	

		for(int i=1;i<=arr.length;i++) {
			for(int j=1;j<=sum;j++) {
				if(arr[i-1] <= j) 
					dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i-1]];
				else 
					dp[i][j] = dp[i-1][j];
			}
			// System.out.println(Arrays.toString(dp[i]));
		}
		return dp[arr.length][sum];
	}

``` 


## 03.Longest Increasing Subsequence

```
    public static int longestIncresingSeq(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, 1);
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j ++) {
                if (nums[i] > nums[j]){
                    memo[i] = Math.max(memo[j] + 1, memo[i]);
                }
            }
            res = Math.max(res, memo[i]);
        }
        System.out.println(Arrays.toString(memo));
        return res;
    }
```

# 04.Longest common substring 

```

	static Integer[][] dp = null;
	static int max(int i, int j, int k) {
		return Math.max(i, Math.max(j, k));
	}
	public static int lcs(String s1, String s2, int l1, int l2) {
		if(l1 < 0 || l2 < 0) 
			return 0;
		if(dp[l1][l2] != null) 
			return dp[l1][l2];
		if(s1.charAt(l1) == s2.charAt(l2)) 
			dp[l1][l2] = 1 + lcs(s1, s2, l1-1, l2-1);
		else 
			dp[l1][l2] = max(
						lcs(s1, s2, l1-1, l2), 
						lcs(s1, s2, l1, l2-1), 
						lcs(s1, s2, l1-1, l2-1));
		return dp[l1][l2];
	}
	public static int lcs(String s1, String s2) {
		int l1 = s1.length(), l2 = s2.length();
		dp = new Integer[l1][l2];
		lcs(s1, s2, l1-1, l2-1);
		for(Integer[] a : dp)
			System.out.println(Arrays.toString(a));
		return dp[l1-1][l2-1];
	}

``` 
## 05. Longest Common Subsequence

```
	private static Integer[][] dp = null;

	public static int max(int a, int b) {
		return Math.max(a, b);
	}
	public static int longestCommonSubsequence(String s1,String s2,int l1, int l2) {
		if(l1 <= 0 || l2 <= 0) return 0;
		if(dp[l1][l2] != null) 
			return dp[l1][l2];
		if(s1.charAt(l1) == s2.charAt(l2)) 
			dp[l1][l2] = 1 + longestCommonSubsequence(s1, s2, l1-1, l2-1);
		else 
			dp[l1][l2] = max(
				longestCommonSubsequence(s1, s2, l1-1, l2),
				longestCommonSubsequence(s1, s2, l1, l2-1)
				);

		return dp[l1][l2];
	}

	public static int longestCommonSubsequence(String s1, String s2) {
		int l1 = s1.length(), l2 = s2.length();
		dp = new Integer[l1][l2];
		return longestCommonSubsequence(s1, s2, l1-1, l2-1);
	}
```

## 06. Maximum Chain length of pairs 

```
public static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][0];
		arr[i][0] = arr[j][0];
		arr[j][0] = temp;

		temp = arr[i][1];
		arr[i][0] = arr[j][1];
		arr[j][1] = temp;
	}
	
	public static int chainLengthOfPairs(int[][] arr) {
		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);

		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i][0] > arr[j][1]  & dp[i] < dp[j]+1)
					dp[i] =  dp[j] + 1;
			}
		}

		System.out.println(Arrays.toString(dp));
		return dp[arr.length-1];
	}
```
## 07. Edit Distance

```
	private static Integer[][] dp = null;

	private static int min(int i, int j, int k) {
		return Math.min(i, Math.min(j, k));
	}

	public static int editDistance(String s1, String s2, int i, int j) {
		if(i < 0 || j < 0 || i == 0 && j == 0) return 0;
		if(i == 0) return j;
		else if(j == 0) return i;
		else if(dp[i][j] != null) return dp[i][j];
		else if(s1.charAt(i) == s2.charAt(j))
			dp[i][j] = editDistance(s1, s2, i-1, j-1);
		else 
			dp[i][j] = 1 + min(
				editDistance(s1, s2, i, j-1) , 	//	Insert
				editDistance(s1, s2, i-1, j) , 	//	Remove
				editDistance(s1, s2, i-1, j-1)	//	Replace	
			);
	return dp[i][j];
	}

	public static int editDistance(String s1, String s2) {
		int l1 = s1.length() , l2 = s2.length();
		dp = new Integer[l1][l2];
		return editDistance(s1, s2, l1-1, l2-1);
	}

``` 


## 08. Unique Path

``` 
	private static Integer[][] dp = null;

	public static int UniquePath(Integer[][] dp, int i, int j) {
		if(i < 0 || j < 0) return 0;
		if(dp[i][j] != null) return dp[i][j];
		else if(i == 0 || j == 0) return 1;
		else 
			dp[i][j] = UniquePath(dp, i-1, j) + UniquePath(dp, i, j-1);
		return dp[i][j];
	}
	public static int UniquePath(int n, int m) {
		dp = new Integer[n][m];
		UniquePath(dp, n-1, n-1);
		return dp[n-1][n-1];
	}

```

## 09. Stack Selling before Selling 

```
	/*
		1) buy a stack before selling
		2) Cannot buy & selling on same day 

	*/

	private static Integer[] dp = null;

	private static int max(int i, int j) {
		return Math.max(i, j);
	}

	public static int maxprofit(int[] stocksPrice, int curr, int n) {
		if(curr >=n) 
			return 0;
		if(dp[curr] != null) 
			return dp[curr];

		int maxVal = 0;
		
		for(int i=curr+1;i<n;i++) {
			if(stocksPrice[curr] < stocksPrice[i])
				maxVal = max( 
						maxVal, 
						stocksPrice[i] - stocksPrice[curr] + maxprofit(stocksPrice, i+2, n));
			maxVal = max(maxVal, maxprofit(stocksPrice, curr+1, n));
			dp[curr] = maxVal;
			return maxVal;
		}
		return maxVal;
	}

	public static int maxprofit(int[] stocksPrice) {
		dp = new Integer[stocksPrice.length + 1];
		return maxprofit(stocksPrice, 0, stocksPrice.length);
	}

```

