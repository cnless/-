package array;

import java.util.Arrays;

/**
 * @Author dsk
 * @Date 2021/9/3 15:02
 */
//leetcode 59
public class 螺旋矩阵2 {
    public static void main(String[] args) {
        generateMatrix(5);
    }
    public static int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int left=0,right=n-1,top=0,tail=n-1,index=1;
        while(index<=n*n){
            if (left==right){
                result[top][left]=index;
                for (int i = 0; i < n; i++) {
                    System.out.println(Arrays.toString(result[i]));
                }
                break;
            }
            for(int column=left;column<right;column++){
                result[top][column]=index++;
            }
            for (int row=top;row<tail;row++){
                result[row][right]=index++;
            }
            for (int column=right;column>left;column--){
                result[tail][column]=index++;
            }
            for (int row=tail;row>top;row--){
                result[row][left]=index++;
            }
            left++;
            top++;
            right--;
            tail--;
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(result[i]));
            }
            System.out.println("===================================");
        }
        return result;
    }
}
