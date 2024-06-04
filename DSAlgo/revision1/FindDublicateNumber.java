package DSAlgo.revision1;

//find the dublicate number

public class FindDublicateNumber {
    public static int findDublicate(int[] nums) {
        int slow = 0, fast = 0;

        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }

        fast = 0;
        while(slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    
    public static void main(String arg[]) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDublicate(nums));
    }
}