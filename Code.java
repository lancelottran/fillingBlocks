int fillingBlocks(int n) {
    if(n == 0)
        return 0;
    
    int[] dp = new int[n+1];
    dp[0] = 1;
    
    if(n >= 1)
        dp[1] = 1;
    if(n >= 2)
        dp[2] = 5;
    if(n >= 3)
        dp[3] = 11;
    
    for(int i = 4; i <= n; i++)
        dp[i] = dp[i-1] + dp[i-2]*5 + dp[i-3]-dp[i-4];
    
    return dp[n];
}
