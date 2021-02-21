package recall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/2/14 19:21
 * @Version 1.0
 */
public class Recall02 {
    public static void main(String[] args) {
        System.out.println((int)'1');
        System.out.println((int)'a');
    }
    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        List<Character> trackNumber = new ArrayList<>();
        List<String> trackString = new ArrayList<>();

        int all = digits.length();
        HashMap<Character, String> map = new HashMap<>(8);
        for (int i = 0; i < all; i++) {
            char item = digits.charAt(i);
            switch (item){
                case '2': map.put(item, "abc"); break;
                case '3': map.put(item, "def"); break;
                case '4': map.put(item, "ghi"); break;
                case '5': map.put(item, "jkl"); break;
                case '6': map.put(item, "mno"); break;
                case '7': map.put(item, "pqrs"); break;
                case '8': map.put(item, "tuv"); break;
                case '9': map.put(item, "wxyz"); break;
                default:break;
            }
        }

        return result;
    }

    private static void backTrack(String digits, HashMap<Character, String> map, String tn, String ts, List<String> result){
        int all = digits.length();
        if (ts.length() == all){
            result.add(ts);
        }
        for (int i = 0; i < all; i++) {
            char item = digits.charAt(i);

        }
    }
}
