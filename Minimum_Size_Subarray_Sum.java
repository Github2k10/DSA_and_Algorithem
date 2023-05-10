public class Minimum_Size_Subarray_Sum {

    public static int minSubArrayLen(int target, int[] nums) {
        int i = -1;
        int j = 0;
        int c = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;

        while(i < nums.length){
            if(sum >= target){
                len = Math.min(len, c);
                sum -= nums[j];
                c--;
                j++;
            } else {
                i++;
                if(i < nums.length){
                    sum += nums[i];
                    c++;
                }
            }
        }

        return len == Integer.MAX_VALUE ? 0 : len;
    }

    public static void main(String[] args){
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int out = minSubArrayLen(target, arr);

        System.out.println(out);
    }
}

