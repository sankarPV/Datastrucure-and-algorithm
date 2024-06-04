package DSAlgo.revision1;
public class SetMatrixZeros {
    public static int[][] setMatrixZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // mark
        int colv = 1;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j!=0) {
                        matrix[0][j] = 0;
                    } else {
                        colv = 0;
                    }
                }
            }
        }

        // set 0
        for(int i = 1; i< m; i++) {
            for(int j =1; j< n; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        //set 0 first row
        if(matrix[0][0] == 0) {
            for(int j = 0; j<n; j++) {
                matrix[0][j] = 0;
            }
        }

        // set 0 first col
        if(colv == 0) {
            for(int i =0; i< m ;i++) {
                matrix[i][0] = 0;
            }
        }

        return matrix;
    }

    public static void main(String args[]) {
        int[][] matrix = {
            {1,2,1},
            {1,0,2},
            {4,5,2}
        };
        int[][] ans = setMatrixZeros(matrix);

        System.out.println(ans);
    }
    
}
