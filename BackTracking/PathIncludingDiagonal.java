package BackTracking;

import java.util.ArrayList;

public class PathIncludingDiagonal {
    public static void main(String[] args) {
        System.out.println(pathcount(3,3));
    }
    static ArrayList<String> path(String p ,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 &&c>1){
            list.addAll(path(p+"d",r-1,c-1));

        }
        if(r>1){
            list.addAll(path(p+"D",r-1,c));

        }
        if(c>1){
            list.addAll(path(p+"R",r,c-1));
        }
        return list;
    }
    static int pathcount(int r,int c){
        if(r==1&&c==1){
            return 1;
        }
        int count = 0;
        if(r>0&& c>0){
            count += pathcount(r-1,c-1);
        }
        if(r>0){
            count += pathcount(r-1,c);
        }
        if(c>0){
            count +=pathcount(r,c-1);
        }
        return count;
    }
}

