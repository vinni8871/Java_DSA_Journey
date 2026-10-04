public class Leet1920 {
    public static void main(String[] args) {
        int[] a = {0, 2, 1, 5, 3, 4};
//        for (int num : a) {
//            System.out.print(num + " ");
//
//        }
        int[] res =  buildArray(a);
        for(int nums : res){
            System.out.print(nums + " ");
        }

    }
        public static int[] buildArray(int[] nums) {

            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[nums[i]];
            }

            return result;
        }
    }
