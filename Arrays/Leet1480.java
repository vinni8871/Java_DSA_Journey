import java.util.Arrays;

public class Leet1480 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
//        for(int e:sumofarray(nums)){
//            System.out.print(e + " ");
//        }
//        int[] arr = sumofarray(nums);
        System.out.println(Arrays.toString(sumofarray(nums)));

    }
    public static int[] sumofarray(int[] n){
        int sum = 0;
        int[] result = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
            result[i]=sum;
        }
        return result;
    }
}
