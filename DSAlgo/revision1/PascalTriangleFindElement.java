//Pascal triangle - find the element of given n, r
package DSAlgo.revision1;
public class PascalTriangleFindElement {
    public static int findElement(int n, int r) {
        int res = 1;
        for(int i =1; i<r; i++) {
            res = res * (n-i);
            res = res / i;
        }
        return res;
    }

    public static void main(String args[]) {
        System.out.println(findElement(5,3));
    }
}