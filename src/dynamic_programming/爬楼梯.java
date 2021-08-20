package dynamic_programming;

/**
 * @Author dsk
 * @Date 2021/8/20 16:42
 */
//leetcode 70
public class 爬楼梯 {
    public int climbStairs(int n) {
        if (n<=1) return n;
        int[] dp=new int[3];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n ; i++) {
            int sum=dp[1]+dp[2];
            dp[1]=dp[2];
            dp[2]=sum;
        }
        return dp[2];

    }
}
