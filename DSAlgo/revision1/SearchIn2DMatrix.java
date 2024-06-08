package DSAlgo.revision1;

import java.util.Arrays;

//Search in a 2D matrix
public class SearchIn2DMatrix {
    public static int[] binarySearch(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int low = 0, high = (n * m) - 1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            int row = mid/m, col = mid%m;

            if(matrix[row][col] == target) {
                return new int[] {row, col};
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{};
    }
    public static void main(String arg[]) {
        int[][] matrix = {
            {1,3,5,7},{10,11,16,20},{23,30,34,60}
        };
        Arrays.stream(binarySearch(matrix, 34)).forEach(System.out::println);
    }
}