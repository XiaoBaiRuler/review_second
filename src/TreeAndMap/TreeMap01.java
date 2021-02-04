package TreeAndMap;

import java.util.*;

/**
 * @Author xiaobai
 * @Date 2021/2/4 8:46
 * @Version 1.0
 */
public class TreeMap01 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        boolean flag = true;
        int size = 0;
        TreeNode item = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            List<Integer> list = new ArrayList<>();
            if (flag){
                size = stack1.size();
                for (int i = 0; i < size; i++) {
                    item = stack1.pop();
                    list.add(item.val);
                    if (item.left != null){
                        stack2.add(item.left);
                    }
                    if (item.right != null){
                        stack2.add(item.right);
                    }
                }
                flag = false;
            }
            else{
                size = stack2.size();
                for (int i = 0; i < size; i++) {
                    item = stack2.pop();
                    assert item != null;
                    list.add(item.val);
                    if (item.right != null){
                        stack1.push(item.right);
                    }
                    if (item.left != null){
                        stack1.push(item.left);
                    }
                }
                flag = true;
            }
            lists.add(list);
        }
        return lists;
    }
}
