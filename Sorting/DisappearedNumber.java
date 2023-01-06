package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumber {
//    public static void main(String[] args) {
//        int[] arr = {4,3,2,7,8,2,,3,1};
//    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctindex = nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                int temp = nums[i];
                nums[i]= nums[correctindex];
                nums[correctindex] = temp;
            }else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index);

            }
        }
        return ans;
    }
}
