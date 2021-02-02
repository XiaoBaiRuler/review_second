package LinkList;

/**
 * @Author xiaobai
 * @Date 2021/2/1 8:46
 * @Version 1.0
 */
public class LinkList01 {
    public static void main(String[] args) {
        int[] nums1 = {0, 8, 6, 5, 6, 8, 3, 5, 7};
        int[] nums2 = {6, 7, 8, 0, 8, 5, 8, 9, 7};
        ListNode l1 = createListNode(nums1);
        ListNode l2 = createListNode(nums2);
        ListNode l = addTwoNumbers(l1, l2);
        while (l != null){
            System.out.print(l.val + " ");
            l = l.next;
        }
    }

    public static ListNode createListNode(int[] nums){
        ListNode root = new ListNode(nums[0], null);
        ListNode node = root;
        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i], null);
            node = node.next;
        }
        return root;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        int add = 0;
        int item = 0;
        int al = 0;
        ListNode root = l1;
        ListNode other = null;
        while (l1 != null && l2 != null){
            al = l1.val + l2.val + add;
            add = al / 10;
            item = al - 10 * add;
            l1.val = item;
            if (l1.next == null){
                other = l1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null){
            while (l1 != null){
                al = l1.val + add;
                add = al / 10;
                item = al - 10 * add;
                l1.val = item;
                if (l1.next == null){
                    other = l1;
                }
                l1 = l1.next;
            }
        }
        if (l2 != null){
            other.next = l2;
            while (l2 != null){
                al = l2.val + add;
                add = al / 10;
                item = al - 10 * add;
                l2.val = item;
                if (l2.next == null){
                    other = l2;
                }
                l2 = l2.next;
            }
        }
        if (add != 0){
            other.next = new ListNode(add, null);
        }
        return root;
    }
}
