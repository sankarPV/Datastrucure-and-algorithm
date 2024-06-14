package DSAlgo.artif;

// Leetcode - 62 Find unique path

public class UniquePath {
    public static int findUniquePath(int m, int n) {
        int r = m + n - 2, c = n - 1;
        long res = 1;

        for(int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(findUniquePath(51, 9));
    }
}