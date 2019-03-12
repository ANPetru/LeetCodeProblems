package leetcode;

/**
 *
 * @author Alex
 */
public class PerfectSquares {

    public static void main(String[] args) {
        System.out.println("" + numSquares(12));
    }

    public static int numSquares(int n) {
        int sum = 0;
        int result = 0;
        while (n - sum > 0) {
            for (int i = n - sum; i > 0; i--) {
                double square = Math.sqrt(i);
                if (square - (int) square == 0) {
                    sum +=  i;
                    result++;
                    break;
                }
            }
        }
        return result;
    }

}
