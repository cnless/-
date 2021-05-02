package bitwise_operation;

public class 出现k次 {
    public static void main(String[] args) {
        int[] arr={2,2,2,0,0,0,4,4,4,8,3,3,3};
        int k=3;
        int len=arr.length;
        char[][] cArr=new char[len][];
        int maxLen=0;
        for (int i = 0; i < len; i++) {
            cArr[i]=new StringBuilder(Integer.toString(arr[i],3)).reverse().toString().toCharArray();
            if(cArr[i].length>maxLen){
                maxLen= cArr.length;
            }
        }
        //无进位加法
        int[] resArr=new int[maxLen];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < maxLen; j++) {
                if (j>=cArr[i].length){
                    resArr[j]+=0;
                }else {
                    resArr[j]+=(cArr[i][j]-'0');
                }
            }
        }
        int result=0;
        for (int i = 0; i < maxLen; i++) {
            result+=(resArr[i]%k)*Math.pow(k,i);
        }
        System.out.println(result);
    }
}
