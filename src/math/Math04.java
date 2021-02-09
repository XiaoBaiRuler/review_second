package math;

/**
 * @Author xiaobai
 * @Date 2021/2/9 10:18
 * @Version 1.0
 */
public class Math04 {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        double result = myPow(0.00001,  Integer.MAX_VALUE);
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        System.out.println(result);
        System.out.println(Integer.MAX_VALUE);
    }

    public static double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return x;
        }
        if (n == -1){
            return 1.0 / x;
        }
        int center = n / 2;
        int all = center * 2;
        double left = myPow(x, center);
        double right = (n == all ? 1 : myPow(x, n - all));
        return left * left * right;
    }
}
