import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node of the current subtree
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Process the node at the top of the stack
            current = stack.pop();
            result.add(current.val);
            
            // Move to the right subtree
            current = current.right;
        }

        return result;
    }
}
