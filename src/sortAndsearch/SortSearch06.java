package sortAndsearch;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author xiaobai
 * @Date 2021/2/21 10:57
 * @Version 1.0
 */
public class SortSearch06 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(findKthLargest(nums, 4));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        Arrays.stream(nums).forEach(priorityQueue::add);
        for (int i = 1; i < k; i++) {
            priorityQueue.remove();
        }
        return priorityQueue.peek();
    }
}
