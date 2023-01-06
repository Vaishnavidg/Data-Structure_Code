package RECURSION;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutationCount("","abcde"));
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        int n = p.length();
        for(int i=0;i<=n;i++){
            String f = p.substring(0,i);
//            System.out.println("f:"+f);
            String s = p.substring(i,n);
//            System.out.println("s:"+s);
            permutation(f+ch+s,up.substring(1));
        }
    }
    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        int n = p.length();
        for(int i=0;i<=n;i++){
            String f = p.substring(0,i);
//            System.out.println("f:"+f);
            String s = p.substring(i,n);
//            System.out.println("s:"+s);
            ans.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        int n = p.length();
        for(int i=0;i<=n;i++){
            String f = p.substring(0,i);
//            System.out.println("f:"+f);
            String s = p.substring(i,n);
//            System.out.println("s:"+s);
            count += permutationCount(f+ch+s,up.substring(1));
        }
        return count;
    }
}
