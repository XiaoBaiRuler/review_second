package listAndstring;

/**
 * @Author xiaobai
 * @Date 2021/1/29 23:31
 * @Version 1.0
 */
public class ListString05 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        int[] nums4 = {1, 7, 4, 5};
        int[] nums5 = {1, 4, 2};
        int[] nums6 = {0, 4, 2, 1, 0, -1, -3};
        System.out.println(increasingTripletChange(nums3));
    }
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3){
            return false;
        }
        boolean flag = true;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] >= nums[j]){
                    flag = false;
                }
                else{
                    flag = true;
                }
                for (int k = j + 1; flag && k < nums.length; k++) {
                    if (nums[j] < nums[k]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean increasingTripletChange(int[] nums){
        if (nums.length < 3){
            return false;
        }
        int min = nums[0];
        int mid = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {

        }
        return false;
    }
}
