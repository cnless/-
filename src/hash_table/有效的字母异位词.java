package hash_table;

/**
 * @Author dsk
 * @Date 2021/8/19 14:04
 */
//leetcode 242
public class 有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        for (char c:s.toCharArray()){
            arr[c-'a']+=1;
        }
        for (char c:t.toCharArray()){
            arr[c-'a']-=1;
        }
        for (int num:arr){
            if (num!=0){
                return false;
            }
        }
        return true;
    }
}
