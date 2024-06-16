package DSAlgo.artif;
import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length, left = 0, right = n - 1;

        while(left <= right) {
            int sum = nums[left] + nums[right];

            if(sum == target) {
                return new int[] {left, right};
            } else if (sum > target) {
                right --;
            } else {
                left ++;
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[] {2,11,7,15}, 9))
                    .forEach(System.out::println);
    }
}