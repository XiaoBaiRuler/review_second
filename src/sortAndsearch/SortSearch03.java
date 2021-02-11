package sortAndsearch;

import java.util.*;

/**
 * @Author xiaobai
 * @Date 2021/2/11 11:38
 * @Version 1.0
 */
public class SortSearch03 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(topKFrequent(nums, 1)));
    }
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
            else {
                hashMap.put(nums[i], 1);
            }
        }
        PriorityQueue<String> maxHeap = new PriorityQueue<String>(hashMap.size(), (o1, o2) -> {
            int a = Integer.parseInt(o1.split("#")[1]);
            int b = Integer.parseInt(o2.split("#")[1]);
            return b - a;
        });
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            maxHeap.add(entry.getKey() + "#" + entry.getValue());
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = Integer.parseInt(Objects.requireNonNull(maxHeap.poll()).split("#")[0]);
        }
        return result;
    }
}
