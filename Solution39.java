//606 Construct String From Binary Tree   08-12-2023 (Friday)



class Solution39 {
    public String tree2str(TreeNode root) {
        
        if(root == null)
        {
            return "";
        }
        StringBuilder result = new StringBuilder();
        preorderTraversal(root,result);
        return result.toString();
    }
private void preorderTraversal(TreeNode node,StringBuilder result)
{
    if(node == null)
    {
    return;
}

    result.append(node.val);

if(node.left != null || node.right != null)
{
    result.append("(");
    preorderTraversal(node.left,result);
    result.append(")");
}
if(node.right != null)
{
    result.append("(");
    preorderTraversal(node.right,result);
    result.append(")");
    
}

}
}