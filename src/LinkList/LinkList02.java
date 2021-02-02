package LinkList;

/**
 * @Author xiaobai
 * @Date 2021/2/2 9:17
 * @Version 1.0
 */
public class LinkList02 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3};
        ListNode root = LinkList01.createListNode(nums);
        root = oddEvenList(root);
        while (root != null){
            System.out.println(root.val);
            root = root.next;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode result1 = head;
        ListNode result2 = head.next;
        ListNode item = head.next;
        ListNode node = head.next.next;
        boolean flag = true;
        while (node != null){
            if (flag){
                head.next = node;
                head = head.next;
                flag = false;
            }
            else{
                item.next = node;
                item = item.next;
                flag = true;
            }
            node = node.next;
        }
        item.next = null;
        head.next = result2;
        return result1;
    }
}
