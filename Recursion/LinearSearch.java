package RECURSION;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6,6, 7, 8};
        int target = 6;
//        System.out.println(lSearch(arr, target, 0));
//        System.out.println(linearSearch(arr, target, 0));
//        System.out.println(fromLastSearch(arr, target, arr.length - 1));
        System.out.println(findAllSearch2(arr, target, 0));
//        System.out.println(list);

    }

    static boolean linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    static int lSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return lSearch(arr, target, index + 1);

        }

    }

    static int fromLastSearch(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return fromLastSearch(arr, target, index - 1);

    }

    //find all duplicate search
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllSearch(arr, target, index + 1);

    }

    //Return an Arraylist
    static ArrayList<Integer> findAllSearch1(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllSearch1(arr, target, index + 1,list);
        return list;

    }

    //Return an Arraylist with passing an argument
    static ArrayList<Integer> findAllSearch2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> allAnswer = findAllSearch2(arr, target, index + 1);
        list.addAll(allAnswer);
        return list;

    }

}
