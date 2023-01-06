package RECURSION;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println( subseqArrayListAscii("","abc"));
//        char a = 'a';
//        char b = 'b';
//        char c = 'c';
//        System.out.println((char)999897);
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }

    static ArrayList<String> subseqArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqArrayList(p+ch,up.substring(1));
        ArrayList<String> right = subseqArrayList(p,up.substring(1));
        left.addAll(right);
        return left;

    }

    static ArrayList<String> subseqArrayListAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqArrayListAscii(p+ch,up.substring(1));
        ArrayList<String> second = subseqArrayListAscii(p,up.substring(1));
        ArrayList<String> third = subseqArrayListAscii((ch+0)+p,up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
