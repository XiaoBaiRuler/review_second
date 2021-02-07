package math;

/**
 * @Author xiaobai
 * @Date 2021/2/7 8:27
 * @Version 1.0
 */
public class Math02 {
    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }
    public static int mySqrt(int x) {
        return sqrt(0, x, x);
    }

    public static int sqrt(int i, int j, int x){
        int center = (j + i) / 2;
        long result = (long)center * center;
        long next = 0;
        if (result == x){
            return center;
        }
        else if (result < x){
            next = (long)(center + 1) * (center + 1);
            if (next == x){
                return center + 1;
            }
            else if (next > x){
                return center;
            }
            else{
                return sqrt(center, j, x);
            }
        }
        else{
            return sqrt(i, center, x);
        }
    }
}
