package math;

/**
 * @Author xiaobai
 * @Date 2021/2/8 10:03
 * @Version 1.0
 */
public class Math03 {
    public static void main(String[] args) {
        System.out.println(titleToNumber(null));
    }
    public static int titleToNumber(String s) {
        if (s == null){
            return 0;
        }
        // x - 64
        int all = s.length() - 1;
        int j = 0;
        int result = 0;
        for (int i = all; i >= 0; i--) {
            result += (s.charAt(j) - 64) * Math.pow(26, i);
            j++;
        }
        return result;
    }
}
