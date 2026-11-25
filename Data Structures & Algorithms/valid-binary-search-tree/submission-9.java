/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    }
    public boolean valid(TreeNode node, long lowerBound, long upperBound){
        if(node == null){
            return true;
        }
        if(!(lowerBound < node.val && node.val < upperBound )){
            return false;
        }
        return valid(node.left,lowerBound, node.val) && valid(node.right, node.val, upperBound);
    }
}
