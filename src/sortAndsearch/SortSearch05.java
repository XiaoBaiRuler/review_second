package sortAndsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author xiaobai
 * @Date 2021/2/19 12:22
 * @Version 1.0
 */
public class SortSearch05 {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 4},
                {2, 6},
                {6, 7},
                {2, 4}
        };
        int[][] intervals1 = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] intervals2 = {
                {1, 4},
                {2, 3}
        };
        System.out.println(Arrays.deepToString(merge(intervals)));
        System.out.println(Arrays.deepToString(merge(intervals1)));
        System.out.println(Arrays.deepToString(merge(intervals2)));

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < intervals.length; i ++) {
            int next = i + 1;
            if (next >= intervals.length){
                break;
            }
            if (intervals[i][1] >= intervals[next][0]){
                intervals[next][0] = intervals[i][0];
                intervals[next][1] = Math.max(intervals[i][1], intervals[next][1]);
                intervals[i][0] = Integer.MAX_VALUE;
            }
        }
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] != Integer.MAX_VALUE) {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
