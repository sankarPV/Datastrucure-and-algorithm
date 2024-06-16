package DSAlgo.artif;
import java.util.*;
import java.util.stream.Collectors;
public class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals) {
        int[] newIntervals = intervals[0];
        List<int[]> result = new ArrayList<>();
        result.add(newIntervals);

        for(int[] interval : intervals) {
            if(interval[0] <= newIntervals[1]){
                newIntervals[1] = Math.max(interval[1], newIntervals[1]);
            } else {
                newIntervals = interval;
                result.add(newIntervals);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals ={
            {1,3}, {2,6},{8,10},{15,18}
        };

        Arrays.stream(mergeIntervals(intervals))
              .map(row -> Arrays.stream(row)
                                .mapToObj(Integer::toString)
                                .collect(Collectors.joining(" ")))
              .forEach(System.out::println);

    }
}