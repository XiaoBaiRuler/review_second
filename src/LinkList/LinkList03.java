package LinkList;

/**
 * @Author xiaobai
 * @Date 2021/2/3 11:07
 * @Version 1.0
 */
public class LinkList03 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ListNode root = LinkList01.createListNode(nums);
    }

    /**
     * 最坏时间复杂度为O(N^2)
     * 空间复杂度为O(1)
     * @param headA headA
     * @param headB headB
     * @return ListNode
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode item = null;
        while (headA != null){
            item = headB;
            while (item != null) {
                if (headA == item) {
                    return headA;
                }
                item = item.next;
            }
            headA = headA.next;
        }
        return null;
    }

    public static ListNode getIntersectionNodeChange(ListNode headA, ListNode headB){
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
    }
}
