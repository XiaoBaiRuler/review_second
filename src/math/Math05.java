package math;

import java.util.HashSet;

/**
 * @Author xiaobai
 * @Date 2021/2/12 18:26
 * @Version 1.0
 */
public class Math05 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                System.out.print(i + "/" + j + " ");
                System.out.println(fractionToDecimal(i, j));
            }
        }
    }

    /**
     * @param numerator int
     * @param denominator int
     * @return String
     */
    public static String fractionToDecimal(int numerator, int denominator) {
        long num = numerator;
        long den = denominator;
        boolean b = false;
        if (num < 0 && den > 0){
            num = -num;
            b = true;
        }
        if (num > 0 && den < 0){
            den = -den;
            b = true;
        }

        HashSet<Long> hashSet = new HashSet<>(10);
        StringBuilder result = new StringBuilder();
        long re = (long)num / den;
        result.append(re);
        long last = (long)num % den;
        if (last != 0){
            result.append(".");
        }
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        StringBuilder wait = new StringBuilder();
        int j = 0;
        boolean flag = false;
        int all = 0;
        while (last != 0){
            if ((all = left.length()) == right.length() && all != 0){
                boolean item = true;
                int r = 0;
                int l = 0;
                while (r < all && l < all){
                    if (left.charAt(l) != right.charAt(r) && item){
                        l ++;
                        j ++;
                    }
                    else if (left.charAt(l) == right.charAt(r)){
                        item = false;
                        wait.append(left.charAt(l));
                        r ++;
                        l ++;
                    }
                    else{
                        r --;
                        wait.deleteCharAt(0);
                        j ++;
                    }
                }
                flag = true;
                break;
            }

            if (!hashSet.contains(last)){
                hashSet.add(last);
                re = (last * 10) / den;
                last = (last * 10) % den;
                left.append(re);
            }
            else{
                re = (last * 10) / den;
                last = (last * 10) % den;
                right.append(re);
            }
        }
        if (flag){
            String str = j != 0 ? left.substring(0, j) : "";
            result.append(str);
            result.append('(');
            result.append(wait);
            result.append(')');
        }
        else{
            result.append(left);
        }
        if (b){
            result.insert(0, '-');
        }
        return result.toString();
    }
}
