package sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr={3,1,6,4,65,43,768,432,4,54,4324,5};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void shellSort(int[] arr){
        for(int interval=arr.length/2;interval>0;interval=interval/2){
            for(int i=interval;i<arr.length;i++){
                int index=i-interval;
                int key=arr[i];
                while (index>-1&&key<arr[index]){
                    arr[index+interval]=arr[index];
                    index-=interval;
                }
                arr[index+interval]=key;
            }
        }
    }
}
