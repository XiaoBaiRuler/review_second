package math;

/**
 * @Author xiaobai
 * @Date 2021/2/21 11:25
 * @Version 1.0
 */
public class Math07 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(2016));
    }

    public static int trailingZeroes(int n) {
        int result = 0;
        int item = 0;
        while ((item = n / 5) != 0){
            n = item;
            result += item;
        }
        return result;
    }
}
