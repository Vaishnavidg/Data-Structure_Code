package BinarySearch;

public class _6_PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,1,0};
        System.out.println(peakSearch(arr));

    }
    static int peakSearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                //array in ascending order
                start = mid+1;

            } else  {// array in descending order
                //this may be the ans, but look at the left
                //this is why end!=mid-1
                end = mid;
            }
        }
        //in the end, start == end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element,that is the max one because that is what the checks say
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time.
        //and if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer

        return start;

    }

}
