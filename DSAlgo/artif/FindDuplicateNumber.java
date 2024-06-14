package DSAlgo.artif;

// Leetcode 287 - Find the duplicate number

public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }

        fast = 0;
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1, 3, 4, 2, 2}));
    }
}