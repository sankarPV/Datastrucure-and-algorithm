package DSAlgo.artif;

//Pascal Triangle - find element
public class PascalTriangleFindElement {
    public static int findElement(int n, int r) {
        long res =1 ;

        for (int i = 0; i<r; i ++) {
            res = (long)res * (n - i);
            res = (long)res / (i + 1);
        }

        return (int) res;
    }

    public static void main(String[] args) {
       System.out.println(
        findElement( 5 , 3)
       );
        
    }
}