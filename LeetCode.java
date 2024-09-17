package BasicArrayProgramming;

public class LeetCode {
    public static int divide(int dividend, int divisor) {
        if(divisor==-1 && dividend == Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }
}
