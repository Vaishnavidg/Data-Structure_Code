package LinearSearch;

import java.util.Arrays;

public class StringSearch {

    public static void main(String[] args) {
        String str = "Kunal";
        char target = 'e';
        System.out.println(Arrays.toString(str.toCharArray()));
//        System.out.println(Search(str, target));
//        System.out.println(Search2(str,target));
    }

    //Method 1
    static int  Search(String str, char target){
        if(str.length()==0){
           return -1;
        }
        else {
            for(int i=0;i<str.length();i++){
                if(target==str.charAt(i)){
                    return i;
                }
            }
        }
        return -1;
    }

    //Method 2
    static boolean  Search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        else {
            for (char ch:str.toCharArray()) {//convert string into char array
                if(ch == target){
                    return true;
                }
            }
        }
        return false;
    }
}
