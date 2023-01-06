package LinearSearch;

public class Linear_Search {
    public static void main(String[] args){
        int[] arr = {1,2,32,454,121};
        int element = 11;
        System.out.println(linearSearch3(arr,element));
    }
    //Method 1
    static  int linearSearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }else{
            for(int i=0;i<arr.length ;i++){
                if(arr[i]==target){
                    return i;
                }
            }
        }
        return -1;
    }
    //Method 2
    static  int linearSearch2(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }

    //Method 3
    static  boolean linearSearch3(int arr[],int target){
        if(arr.length==0){
            return false;
        }else{
            for(int element :arr){
                if(element == target){
                    return true;
                }
            }
        }
        return false;
    }

}
