package dynamic_programming;

/**
 * @Author dsk
 * @Date 2021/8/16 18:56
 */
//leetcode 509
public class 斐波那契数 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new 斐波那契数().fib2(45));
    }
    public int fib(int n) {
        if(n<=0) return n;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;//
        }
        return dp[n];
    }
    //优化一下，只需维护两个数值就行
    public int fib2(int n) {
        if(n<=0) return n;
        int[] dp=new int[2];
        dp[1]=1;
        for (int i=2;i<=n;i++){
            int sum=(dp[0]+dp[1])%1000000007;
            dp[0]=dp[1];
            dp[1]=sum;
        }
        return dp[1];
    }
}
