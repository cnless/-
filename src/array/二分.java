package array;

/**
 * @Author dsk
 * @Date 2021/8/17 14:33
 */
//leetcode 704
public class 二分 {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,7,8,9,14,15};
        System.out.println(new 二分().search(arr, 15));
    }
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)>>1;
            if(target==nums[mid]){
                return mid;
            }else if (target>nums[mid]){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
