package array;

/**
 * @Author dsk
 * @Date 2021/9/2 22:20
 */
//leetcode 209
public class 长度最小的子数组 {
    //滑动窗口法
    public int minSubArrayLen(int target, int[] nums) {
        int result=Integer.MAX_VALUE;
        int sum=0;
        int start=0;
        int subLength=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while (sum>=target){
                subLength=i-start+1;
                result=result<subLength?result:subLength;
                sum-=nums[start++];
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}
