package RECURSION;

//Skip 'a' from the string
public class StringSkip {
    public static void main(String[] args) {
        String arr = "baccad";
        skip(arr,"");
        System.out.println(skipAppNotApple("baccappledhaal"));
    }
    static void skip(String org,String upd){
        if(org.isEmpty()){
            System.out.println(upd);
            return;
        }
        char ch = org.charAt(0);
        if(ch == 'a'){
            skip(org.substring(1),upd);
        }else {
            skip(org.substring(1),upd+ch);
        }
    }

    static String skip(String org){
        if(org.isEmpty()){
            return "";
        }
        char ch = org.charAt(0);
        if(ch == 'a'){
            return skip(org.substring(1));
        }else {
            return ch+ skip(org.substring(1));
        }
    }

    //Skip a String
    static String skipstr(String org){
        if(org.isEmpty()){
            return "";
        }
        char ch = org.charAt(0);
        if(org.startsWith("apple")){
            return skipstr(org.substring(5));
        }else {
            return ch+ skipstr(org.substring(1));
        }
    }

    //skip app when it's not apple
    static String skipAppNotApple(String org){
        if(org.isEmpty()){
            return "";
        }
        char ch = org.charAt(0);
        if(org.startsWith("app") & !org.startsWith("apple")){
            return skipAppNotApple(org.substring(3));
        }else {
            return ch+ skipAppNotApple(org.substring(1));
        }
    }




}
