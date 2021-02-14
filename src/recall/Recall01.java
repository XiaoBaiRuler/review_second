package recall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntUnaryOperator;

/**
 * @Author xiaobai
 * @Date 2021/2/13 22:23
 * @Version 1.0
 */
public class Recall01 {
    public static void main(String[] args) {
        int[] nums = new int[2];
        Arrays.setAll(nums, (i) -> i + 1);
        System.out.println(permute(nums));
    }

    private static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        backTrack(nums, track, res);
        return res;
    }

    private static void backTrack(int[] nums, LinkedList<Integer> track, List<List<Integer>> res){
        if (track.size() == nums.length){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i ++){
            // 排除不合法的选项
            if (track.contains(nums[i])){
                continue;
            }
            // 做选择
            track.add(nums[i]);
            // 下一层决策树
            backTrack(nums, track, res);
            // 取消选择
            track.removeLast();
        }
    }


}
