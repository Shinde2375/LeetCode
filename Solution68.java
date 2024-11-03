//938. Range Sum of BST         08/01/2024(Monday);

import javax.swing.tree.TreeNode;

public class Solution68 {
    
    class Solution {

        public int rangeSumBST(TreeNode root, int low, int high) {
            if (root == null) {
                return 0;
            }
    
            // If the current node's value is within the range, add it to the sum
            int sum = 0;
            if (root.val >= low && root.val <= high) {
                sum += root.val;
            }
    
            // Recursively explore the left and right subtrees if they can possibly contain values in the range
            if (root.val > low) {
                sum += rangeSumBST(root.left, low, high);
            }
            if (root.val < high) {
                sum += rangeSumBST(root.right, low, high);
            }
    
            return sum;
        }
    }
}
