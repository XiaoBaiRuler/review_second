package sortAndsearch;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/22 12:00
 * @Version 1.0
 */
public class SortSearch07 {
    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 8, 10};
        int[] nums2 = {1};
        int[] nums3 = {2, 2};
        System.out.println(Arrays.toString(searchRange(nums2, 1)));
    }
    public static int[] searchRange(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        int index = -1;
        while (i <= j){
            int center = (i + j) / 2;
            if (nums[center] == target){
                index = center;
                break;
            }
            if (nums[center] > target){
                j = center - 1;
            }
            else{
                i = center + 1;
            }
        }

        if (index != -1){
            i = index;
            j = index;
            while (i >= 0 && nums[i] == target){
                i --;
            }
            while (j < nums.length && nums[j] == target){
                j ++;
            }
            return new int[]{i + 1, j - 1};
        }

        return new int[]{-1, -1};
    }
}
