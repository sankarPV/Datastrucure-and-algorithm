//Pascal triangle - find the row of given n
package DSAlgo.revision1;

import java.util.*;

public class PascalTriangleFindRow {
    public static List<Integer> findRow(int n) {
        int res = 1;
        List<Integer> list = new ArrayList<>();
        list.add(res);
        for(int i =0;i<n;i++) {
            res = res * (n - i);
            res = res / (i +1);
            list.add(res);
        }

        return list;
    }

    public static void main(String arg[]) {
        System.out.println(findRow(5));
    }
}