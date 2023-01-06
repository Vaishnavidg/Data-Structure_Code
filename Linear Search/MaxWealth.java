package LinearSearch;


//Find the maximum wealth
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,4},{13,2,0}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        //rows = persons;
        //columns = accounts;

        int max = accounts[0][0];
        for(int person = 0;person<accounts.length;person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }

            if(sum>max) {
                max = sum;
            }

        }
        return max;
    }
}
