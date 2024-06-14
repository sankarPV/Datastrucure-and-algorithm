package DSAlgo.revision1;

//majority element of n/2 times

public class MejorityElementnby2Times {
    public static int majorityElement(int[] nums) {
        int count = 0, element = Integer.MIN_VALUE;

        for(Integer num : nums) {
            if(count == 0) {
                count = 1;
                element = num;
            } else if (element == num) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }

    public static void main(String arg[]) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

}