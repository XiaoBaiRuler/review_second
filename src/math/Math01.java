package math;

/**
 * @Author xiaobai
 * @Date 2021/2/6 12:51
 * @Version 1.0
 */
public class Math01 {
    public static void main(String[] args) {
        System.out.println(getSum(5, 7));
    }
    public static int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        while (carry != 0){
            a = sum;
            b = carry;
            sum = a ^ b;
            carry = (a & b) << 1;
        }
        return sum;
    }
}
