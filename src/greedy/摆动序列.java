package greedy;

/**
 * @Author dsk
 * @Date 2021/8/22 20:19
 */
//leetcode 376
public class 摆动序列 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1) return nums.length;
        int result=1;
        int curDiff=0;
        int preDiff=0;
        for (int i = 1; i < nums.length ; i++) {
            curDiff=nums[i]-nums[i-1];
            if((curDiff>0&&preDiff<=0)||(curDiff<0&&preDiff>=0)){
                result++;
                preDiff=curDiff;
            }
        }
        return result;
    }
}
