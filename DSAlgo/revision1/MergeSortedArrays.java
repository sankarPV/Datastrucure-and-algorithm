package DSAlgo.revision1;

//merge sorted arrays
import java.util.*;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = nums1.length -1;

        while(j>=0) {
            if(i>=0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;
    }

    public static void main(String arg[]) {
        int[] num1 = {1,2,3,0,0,0}, num2 = {2,5,6};
        int m = 3, n = 3;
        Arrays.stream(mergeSortedArrays(num1, m, num2, n)).forEach(System.out::println);
    }
}