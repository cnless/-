package array;

/**
 * @Author dsk
 * @Date 2021/8/25 11:26
 */
//leetcode 27
public class 移除元素 {
    public int removeElement(int[] nums, int val) {
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if (val!=nums[fast]){
                nums[slow++]=nums[fast];
            }
        }
        return slow;
    }

}
