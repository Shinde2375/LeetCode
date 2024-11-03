//1026. Maximum Difference Between Node and Ancestor        11-01-2024(Thursday);

import javax.swing.tree.TreeNode;

public class Solution71 
{

             class TreeNode {
             int val;
            TreeNode left;
            TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
    
     public int maxAncestorDiff(TreeNode root)
     {
        return findMax(root,root.val,root.val);
     }

     public int findMax(TreeNode root, int minV,int maxV)
     {
        if(root == null)
        {
            return Math.abs(minV- maxV);
        }
        minV = Math.min(minV,root.val);
        maxV = Math.max(maxV , root.val);

        int l = findMax(root.left , minV,maxV);
        int r = findMax(root.right , minV,maxV);

        return Math.max(l,r);
     }
}
