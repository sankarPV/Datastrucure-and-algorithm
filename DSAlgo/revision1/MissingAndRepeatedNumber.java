package DSAlgo.revision1;

// find missing and repeated number in an array

import java.util.*;

public class MissingAndRepeatedNumber {

    public static int[] findMissingAndRepeatingNumber(int[] nums) {
        // s - sn
        // s2 - s2n

        int n = nums.length;
        long s = 0, s2 =0;
        long sn = (n * (n+1)) / 2;
        long s2n = (n * (n+1) * (2*n + 1)) / 6;
        for(int i=0;i<n;i++) {
            s += nums[i]; 
            s2 += (long)( nums[i] * nums[i] );
        }

        long xMinusY = s - sn; // x - y
        long xPlusY = s2 - s2n; // (x2 - y2) formula is (x + y) (x - y)
        xPlusY = xPlusY / xMinusY; // x + y

        long x = (xMinusY + xPlusY) / 2;
        long y = xPlusY - x;

        return new int[] {(int)x, (int)y}; // x - missing number and y - repeating number

    }

    public static void main(String arg[]) {
        int[] nums = {8, 4, 1, 6, 7, 2, 5, 8 };
        Arrays.stream(findMissingAndRepeatingNumber(nums)).forEach(System.out::println);
    }
}