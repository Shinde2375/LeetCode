//872. Leaf-Similar Trees   09/01/2024(Tuesday)

public class Solution69 {
     public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafval1 = new ArrayList<>();
        List<Integer> leafval2 = new ArrayList<>();

        collectleaf(root1,leafval1);
        collectleaf(root2,leafval2);

        return leafval1.equals(leafval2);
    }

    private void collectleaf(TreeNode root,List<Integer>lval)
    {
        if(root ==null)
        {
            return;
        }
        if(root.left == null && root.right == null)
        {
            lval.add(root.val);
        }
        collectleaf(root.left,lval);
        collectleaf(root.right,lval);
    }
}
