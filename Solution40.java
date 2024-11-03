//94. Binary Tree Inorder Traversal                                 09-12-2023 (Saturday)

//Approch 1

import java.util.InputMismatchException;
import java.util.Scanner;

class Solution40 {
    public List<Integer> inHelper(TreeNode root,List<Integer> list)
    {
        if(root == null)
        return list;
    
        inHelper(root.left,list);
    
        list.add(root.val);
    
        inHelper(root.right,list);
    
        return list;
    }
    
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            return inHelper(root,list);
        }
    }



//Approch 2

// class Solution40 {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         helper(root, res);
//         return res;
//     }

//     public void helper(TreeNode root, List<Integer> res) {
//         if (root != null) {
//             helper(root.left, res);
//             res.add(root.val);
//             helper(root.right, res);
//         }
//     }
// }


Scanner sc = new Scanner(System.in);
double d = sc.nextDouble()
int ans  =0;
try
{
ans  = Math.p

}
catch(Exception e)
{
    e.getMessage();
}