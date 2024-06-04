package DSAlgo.revision1;

//overlapping sub-intervals
import java.util.*;

public class OverlappingSubIntervals {
    
    public static int[][] merge(int[][] intervals) {
        //sort intervals
        intervals = Arrays.stream(intervals).sorted(
            Comparator.comparingInt((int[] a) -> a[1]).thenComparingInt(a -> a[0])
        ).toArray(int[][]::new);

        int[] newIntervals = intervals[0];
        List<int[]> result = new ArrayList<>();
        result.add(newIntervals);
        for(int[] interval : intervals) {
            if(interval[0] <= newIntervals[1]) {
                newIntervals[1] = Math.max(interval[1], newIntervals[1]);
            } else {
                newIntervals = interval;
                result.add(newIntervals);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String arg[]) {
        int[][] intervals = {
            {1,3},{2,6},{8,10},{15,18}
        };
        int[][]ans = merge(intervals);
        System.out.println(ans);
    }
}