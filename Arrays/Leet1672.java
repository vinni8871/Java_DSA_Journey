import java.util.Arrays;

public class Leet1672 {
    public static void main(String[] args){
        int[][] accounts = {{1,2,3},{2,2,1},{9,2,1},{3,5,1}};
//        System.out.print(Arrays.toString(maximum(accounts)));
        System.out.println(maximum(accounts));
//        System.out.println(accounts.length);

    }

    public static int maximum(int[][] n){
        int max = 0;
        int[] result = new int[n.length];

        for (int row = 0; row < n.length; row++) {
            int sum = 0 ;
            for (int i = 0; i < n[row].length; i++) {
                sum = sum + n[row][i];
            }
            result[row] = sum;
        }
        for(int e : result){
            if(e>max){
                max = e;
            }
        }
        return max;
    }
}
