package BinarySearch;

public class _7_find_in_MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,1,0};
        int target = 3;
        System.out.println(Search(arr,target));


    }
    static int Search(int[] arr,int target){
        int peak = PeakSearch(arr);
        int firstTry = OrderSearch(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
       return OrderSearch(arr,target,peak+1,arr.length-1);
    }

    static int PeakSearch(int[] arr){
        int start = 0;
        int end = arr.length;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){//ascending order
                start = mid+1;
            }else{ //descending order
                end = mid;
            }
        }
        return start;
    }
    static int OrderSearch(int[] arr, int target,int start,int end){
        while(start<end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if (target>arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
      return -1;
    }
}
