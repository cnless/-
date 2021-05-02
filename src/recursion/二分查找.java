package recursion;

public class 二分查找 {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,7,8,9,14,15};
        System.out.println(binSearch(arr, 0, 8, 10));
    }
    public static int binSearch(int srcArray[], int start, int end, int key) {
        if(start>=end) return -1;
        int mid = ((end-start)>>1) + start;
        if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid , key);
        }else {
            return mid;
        }
    }
}
