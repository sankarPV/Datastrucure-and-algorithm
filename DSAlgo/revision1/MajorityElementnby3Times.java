package DSAlgo.revision1;

import java.util.*;

//majority element of n/3 times

public class MajorityElementnby3Times {
    public static List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0, element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;

        for(Integer num : nums) {
            if(count1 == 0 && element1 != num) {
                count1 = 1;
                element1 = num;
            } else if (count2 == 0 && element2 != num) {
                count2 = 1;
                element2 = num;
            } else if (element1 == num) {
                count1++;
            }  else if (element2 == num) {
                count2++;
            } else {
                count1--; count2--;
            }
        }
        count1 = 0; count2 = 0;
        List<Integer> list = new ArrayList<>();
        for(Integer num: nums) {
            if(element1 == num) count1++;
            if(element2 == num) count2++;
        }
        int n = nums.length;
        int mini = (n/3) + 1;
        if(count1 >= mini) list.add(element1);
        if(count2 >= mini) list.add(element2);
        return list;
    }

    public static void main(String arg[]) {
        int[] nums = {2,2,1,1,1,2,2};
        majorityElement(nums).stream().forEach(System.out::println);
    }
}