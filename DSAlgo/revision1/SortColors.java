package DSAlgo.revision1;

import java.util.*;

// Dutch flag algorithm
public class SortColors {
    public static int[] sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid<= high) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }else if(nums[mid] == 1) {
                mid++;
            }else if(nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }

    public static void main(String arg[]) {
        int[] nums = {2,0,2,1,1,0};
        Arrays.stream(sortColors(nums)).forEach(System.out::println);
    }
}