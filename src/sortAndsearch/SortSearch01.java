package sortAndsearch;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/9 21:43
 * @Version 1.0
 */
public class SortSearch01 {
    public static void main(String[] args) {
        int[] nums = {1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length;
        int count = 0;
        while (count < j){
            if (nums[count] == 0){
                swap(nums, count, i);
                i ++;
            }
            count ++;
        }
        count = count - 1;

        while (count >= i){
            if (nums[count] == 2){
                j --;
                swap(nums, count, j);
            }
            count --;
        }
    }
    private static void swap(int[] nums, int a, int b){
        int item = nums[a];
        nums[a] = nums[b];
        nums[b] = item;
    }
}
