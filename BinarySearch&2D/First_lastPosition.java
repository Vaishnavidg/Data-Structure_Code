package BinarySearch;

public class First_lastPosition {
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 7;
        int[] ans =searchRange(nums,target);           //obtain the array
        for (int i = 0; i < ans.length; i++) //for loop to print the array
            System.out.print( ans[i]+ " ");
    }


    static int[] searchRange(int[] nums, int target){
            int[] ans = {-1,-1};
            ans[0] = search(nums,target,true);
            ans[1] = search(nums,target,false);
        return ans;
    }
    static int search(int[] nums,int target,boolean firstSearch){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if (target>nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(firstSearch){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return ans;
    }



}
