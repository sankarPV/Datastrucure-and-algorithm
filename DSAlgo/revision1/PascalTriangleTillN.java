//Pascal Triangle print for till n
package DSAlgo.revision1;

import java.util.*;

public class PascalTriangleTillN {
    
    public static List<Integer> findRow(int row) {
        int res = 1;
        List<Integer> list = new ArrayList<>();
        list.add(res);

        for(int i=1; i<row; i++) {
            res = res * (row-i);
            res = res / i+1;
            list.add(res);
        }
        return list;
    }

    public static List<List<Integer>> printN(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            result.add(findRow(i));
        }
        return result;
    }

    public static void main(String arg[]) {
        System.out.println(printN(6));
    }
}