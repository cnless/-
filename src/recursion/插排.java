package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 插排 {
    public static void main(String[] args) {
        int[] arr={3,1,6,4,65,43,768,432,4,54,4324,5};
        insertSort(arr,11);
        System.out.println(Arrays.toString(arr));
    }
    static void insertSort(int[] arr,int k){
        if(k==0) return;
        insertSort(arr,k-1);
        int index=k-1;
        int x=arr[k];
        while (index>-1 && x<arr[index]){
            arr[index+1]=arr[index];
            index--;
        }
        arr[index+1]=x;
    }
}
