package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={3,243,54,7667,8,0,98,7,8,42,3,543,7633,556,67,78,6,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int p,int r){
        if(p<r){
            int q = partition(arr,p,r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
        }
    }
    public static int partition(int[] arr,int p,int r){
        int sc=p+1;
        int bigger=r;
        while (sc<=bigger){
            if(arr[sc]<=arr[p]){
                sc++;
            }else {
                swap(arr,sc,bigger);
                bigger--;
            }
        }
        swap(arr,p,bigger);
        return bigger;
    }
    public static int partition2(int[] arr,int p,int r){
        int left=p+1;
        int right=r;
        while (left<=right){
            while (left<=right&&arr[left]<=arr[p]) left++;
            while (left<=right&&arr[right]>arr[p]) right--;
            swap(arr,left,right);
        }
        swap(arr,p,right);
        return right;
    }
    public static void swap(int[] arr,int p,int q){
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
    }
}
