package RECURSION;

import java.util.ArrayList;

public class PhoneNumbe {
    public static void main(String[] args) {
        System.out.println(phonePadCount("","12"));
//        System.out.println((int)('1'));
    }
    static void phonePad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';//converted to int
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            phonePad(p+ch,up.substring(1));

        }

    }
    static ArrayList<String> phonePadList(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';//converted to int
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(phonePadList(p + ch, up.substring(1)));

        }
        return ans;
    }

        static int phonePadCount(String p,String up){
            if(up.isEmpty()){
                return 1;
            }
            int count = 0;
            int digit = up.charAt(0)-'0';//converted to int
            for(int i=(digit-1)*3;i<digit*3;i++){
                char ch = (char)('a'+i);
                count = count+ phonePadCount(p+ch,up.substring(1));

            }
            return count;

        }
    }

