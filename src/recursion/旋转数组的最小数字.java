package recursion;

import java.util.Arrays;

public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,1,2};
        System.out.println(min1(arr));

    }
    public static int min1(int[] arr){
        if(arr.length==1) return arr[0];
        int begin=0;
        int end=arr.length-1;
        int mid=(end+begin)>>>1;
        if(mid==0) return arr[1];
        if(arr[mid]>arr[end]) {
            return min1(Arrays.copyOfRange(arr,mid+1,end+1));
        }else {
            return min1(Arrays.copyOfRange(arr,begin,mid+1));
        }
    }
    public static int min2(int[] arr){
        int begin=0;
        int end= arr.length-1;
        if(arr[begin]<arr[end]) return arr[begin];
        while (begin+1<end){
            int mid=(end+begin)>>>1;
            if(arr[mid]>=arr[begin]){
                begin = mid;
            }else {
                end = mid;
            }
        }
        return arr[end];
    }


}
