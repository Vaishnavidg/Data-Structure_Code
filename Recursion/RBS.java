package RECURSION;

//Rotate Binary Search
public class RBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(Search(arr,9,0, arr.length));
    }
    static int Search(int[] arr, int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s]<= arr[m]){
            if(target >=arr[s] && target<= arr[m]){
                return Search(arr,target,s,m-1);
            }
            else {
                return Search(arr,target,m+1,e);
            }
        }
        if(arr[s]>=arr[m] & target<=arr[e]){
            return Search(arr,target,m+1,e);
        }
        else {
            return Search(arr,target,s,m-1);
        }
    }
}
