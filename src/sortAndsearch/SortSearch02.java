package sortAndsearch;

/**
 * @Author xiaobai
 * @Date 2021/2/10 18:39
 * @Version 1.0
 */
public class SortSearch02 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 0, 1, 2};
        System.out.println(searchChange(nums,0));
    }

    /**
     * 正常遍历O(N)
     * @param nums int[]
     * @param target target
     * @return int
     */
    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            if (nums[i] == target){
                return i;
            }
            i ++;
            if (nums[j] == target){
                return j;
            }
            j --;
        }
        return -1;
    }

    public static int searchChange(int[] nums, int target){
        int all = nums.length;
        if (all == 0){
            return -1;
        }
        if (all == 1){
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = all - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[0] <= nums[mid]){
                if (nums[left] <= target && nums[mid] > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if (nums[right] >= target && nums[mid] < target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

}
