package listAndstring;

/**
 * @Author xiaobai
 * @Date 2021/1/29 21:47
 * @Version 1.0
 */
public class ListString04 {
    public static void main(String[] args) {

    }
    public static String longestPalindrome(String s) {
        int all = s.length();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < all; i++) {
            sb.append(s.charAt(i));
            for (int j = i; j >= 0; j--) {

            }
        }

        return null;
    }
}