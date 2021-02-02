package listAndstring;

import java.util.HashSet;

/**
 * @Author xiaobai
 * @Date 2021/1/29 21:47
 * @Version 1.0
 */
public class ListString03 {
    public static void main(String[] args) {
        // 3, 1, 3, 3, 1
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "dvdf";
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));

    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null){
            return 0;
        }
        int all = s.length();
        StringBuffer str = new StringBuffer();
        int max = 0;
        int result = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < all; i++) {
            char c = s.charAt(i);
            if (!hashSet.contains(c)){
                hashSet.add(c);
                str.append(c);
                max ++;
            }
            else{
                hashSet.clear();
                if (max > result){
                    result = max;
                }
                for (int j = max - 1; j >= 0; j--) {
                    if (str.charAt(j) != c){
                        i --;
                    }
                    else{
                        i --;
                        break;
                    }
                }
                str = new StringBuffer();
                max = 0;
            }
        }
        if (max > result){
            result = max;
        }
        return result;
    }
}
