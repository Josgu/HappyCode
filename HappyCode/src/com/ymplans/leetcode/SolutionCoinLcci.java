package com.ymplans.leetcode;

/**
 * @author Jos
 */

/*
 * 题解：
 * 完全背包问题：不固定硬币数量来达到固定的值
 * 解题思路：动态规划
 * 当n为0时，有一种组合就是没有硬币所以
 * 边界：dp[0] = 1
 * 状态转移方程：dp[k] = dp[k] + dp[coinValue - k]
 */

public class SolutionCoinLcci {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.waysToChange(1000));
    }
}

class Solution {
    int[] coinValues = new int[]{1,5,10,25};
    private final int mod = 1000000007;
    public int waysToChange(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int coinValue : coinValues){
            for(int i = coinValue; i <= n; i++){
                dp[i] = (dp[i] + dp[i - coinValue])%mod;
            }
        }
        return dp[n];
    }
}