package BinarySearch;

public class _2_floorOfNumber {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floorNumber(arr,target));
    }
    //floor of number: greatest number which is smaller than or equals to target

    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //[2,3,5,9,14,16,18]
        while(start<=end){
            //1.start = 0;end = 6
            //2.start = 4;end = 6
            //3.start = 4;end = 4----it violates the while condition so, return start.

            //1.mid = 3=>9
            //2.mid = 5 = >16
            int mid = start+(end-start)/2;

            //1.target!=9
            //2.target!=16
            if(target==arr[mid]){
                return mid;
            }
            //1.target >9 =>true
            //so,start = [14],4; end = [18],6
            //2.target>16 =>false
            if(target>arr[mid]){
                start = mid+1;
            }else{
                //2.target<16 =>true
                //end = 4
                end = mid-1;
            }
        }
        return end;
    }

}
