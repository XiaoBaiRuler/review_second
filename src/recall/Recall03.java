package recall;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author xiaobai
 * @Date 2021/3/4 10:22
 * @Version 1.0
 */
public class Recall03 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        backTrack(track, nums, result, 0);
        return result;
    }

    private static void backTrack(LinkedList<Integer> track, int[] nums, List<List<Integer>> result, int start){

        result.add(new LinkedList<>(track));

        for (int i = start; i < nums.length; i++) {
            // 做选择
            track.add(nums[i]);
            // 下一层决策树
            backTrack(track, nums, result, i + 1);
            // 取消选择
            track.removeLast();
        }
    }
}
