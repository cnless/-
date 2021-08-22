package string;

/**
 * @Author dsk
 * @Date 2021/8/20 18:45
 */

public class 反转字符串 {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while (left<right){
            s[left]^=s[right];
            s[right]^=s[left];
            s[left]^=s[right];
            right--;
            left++;
        }
    }
}
