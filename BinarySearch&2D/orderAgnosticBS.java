package BinarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        //Ascending order
//        int arr[] = { 2,3,4,9,11,12,14,20,36,48};
        //descending order
        int arr[] = {48,36,14,12,11,9,4,3,2};
        int target = 4;
        System.out.println(orderAgnosticbs(arr,target));
    }


    static int orderAgnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        //find whether the array is sorted in ascending or descending order
        boolean iAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }

            //if Ascending order
            if (iAsc) {
                if(target<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
            //if Descending order
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
