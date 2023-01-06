package LinearSearch;


//Search for 3 in the range of index[1,4]
public class InRangeSearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,543,2,1,3,4,65};
        int target = 4;
        System.out.println(rangeSearch(arr,target,2,5));
    }
    static int rangeSearch(int[] arr, int target,int start,int end){
        if(arr.length ==0){
            return -1;
        }else{
            for (int i=start;i<=end;i++){
                if(arr[i]==target){
                    return i;
                }
            }
        }
        return -1;
    }
}
