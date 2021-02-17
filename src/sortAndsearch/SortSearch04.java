package sortAndsearch;


/**
 * @Author xiaobai
 * @Date 2021/2/17 9:59
 * @Version 1.0
 */
public class SortSearch04 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int left = i - 1;
            int right = i + 1;
            if (left == -1 || nums[left] < nums[i]){
                if (right == nums.length || nums[right] < nums[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}
