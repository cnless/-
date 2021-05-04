package search;

public class 特殊有序数组中查找 {
    public static void main(String[] args) {
        String[] arr={"a","","ab","","","ac","b","ba","","bd"};
        System.out.println(indexOf(arr,"a"));
    }
    public static int indexOf(String[] arr,String p){
        int begin=0;
        int end= arr.length-1;
        while (begin<=end){
            int mid=(begin+end)>>>1;
            while (arr[mid].equals("")){
                mid++;
                if (mid>end){
                    return -1;
                }
            }
            if (arr[mid].compareTo(p)>0){
                end=mid-1;
            }else if(arr[mid].compareTo(p)<0){
                begin=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
