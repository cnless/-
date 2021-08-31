package array;

/**
 * @Author dsk
 * @Date 2021/8/26 15:06
 */
//leetcode 977
public class 有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        int head=0;
        int tail= nums.length-1;
        int[] newNums=new int[nums.length];
        for (int i = nums.length-1; i >=0; i--) {
            if(nums[head]*nums[head]>=nums[tail]*nums[tail]){
                newNums[i]=nums[head]*nums[head];
                head++;
            }else {
                newNums[i]=nums[tail]*nums[tail];
                tail--;
            }
        }
        return newNums;
    }
}
