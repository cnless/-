package string;

/**
 * @Author dsk
 * @Date 2021/8/24 22:06
 */
//leetcode 541
public class 反转字符串2 {
    public String reverseStr(String s, int k) {
        char[] chars=s.toCharArray();
        int i=0;
        while (i<chars.length){
            if((chars.length-i)<k){
                reverse(chars,i, chars.length-1);
            }else {
                reverse(chars,i,i+k-1);
            }
            i+=2*k;
        }
        return new String(chars);
    }
    public static void reverse(char[] chars,int start,int end){
        for (int i = start; i <end ; i++) {
            chars[i]^=chars[end];
            chars[end]^=chars[i];
            chars[i]^=chars[end];
            end--;
        }
    }
}
