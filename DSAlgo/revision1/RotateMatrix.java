package DSAlgo.revision1;

public class RotateMatrix {
    public static int[][] rotateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        //Transpose
        for(int i=0;i<m;i++) {
            for(int j=i+1;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //Reverse each row
        for(int i=0;i<m;i++) {
            for(int j=0;j<n/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 -j];
                matrix[i][matrix.length - 1 -j] = temp;
            }
        }

        return matrix;
    }

    public static void main(String arg[]) {
        int[][] matrix = {
            {1,2,3},{4,5,6},{7,8,9}
        };
        int[][] result = rotateMatrix(matrix);
        System.out.println(result);
    }
}