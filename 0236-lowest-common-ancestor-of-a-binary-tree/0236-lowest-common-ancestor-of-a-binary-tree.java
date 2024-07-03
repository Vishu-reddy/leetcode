/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if(root==null){
        //     return root;
        // }
        // if((root.val>=p.val && root.val<=q.val)||(root.val<=p.val && root.val>=q.val)){
        //     return root;
        // }
        // if(root.val>p.val && root.val>q.val){
        //     return lowestCommonAncestor(root.left,p,q);
        // }
        // return lowestCommonAncestor(root.right,p,q); 
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recur for left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are non-null, this means p and q are found in different subtrees
        // so root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null node (either left or right)
        return (left != null) ? left : right;
    }
}