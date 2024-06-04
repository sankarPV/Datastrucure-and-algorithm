package DSAlgo.revision1;

//Kadan's algorithm
import java.util.*;
public class MaxSubarray {

    public static List<Integer> masSubarray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        int start = -1, end = -1;
        List<Integer> ans = new ArrayList<>();

        for(int i =0;i<nums.length;i++) {
            start = (sum==0)? i : start;
            sum += nums[i];
            if (sum > max) {
                max = sum;
                end = i;
            }
            sum = (sum < 0)? 0: sum;
        }

        System.out.println(max);

        for(int i = start; i<=end; i++) {
            ans.add(nums[i]);
        }
        return ans;

    }

    public static void main(String arg[]) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(masSubarray(nums));
    }

}