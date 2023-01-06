package BinarySearch;

// return the smallest character in the array that is larget than target
// letters = ["c","f","j"]
public class _3_SmallerLetter {
    public static void main(String[] args) {
        char letter[] = {'c','f','j'};
        char target = 'c'; // output ="c";
        System.out.println(smallerLetter(letter,target));
    }

    static char smallerLetter(char[] letter, char target) {
        int start = 0;
        int end = letter.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if(target>letter[mid]){
                start = mid+1;
            } else if (target<letter[mid]) {
                end = mid-1;
            }
            if(start == letter.length){
                start = 0;
            }
        }
        //return letter[start%letter.length];
        return letter[start];
    }

}
