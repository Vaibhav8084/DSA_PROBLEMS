// LeetCode: Validate Binary Search Tree
// Submit this class in the matching LeetCode problem.
class Solution { public boolean isValidBST(TreeNode root){return check(root,Long.MIN_VALUE,Long.MAX_VALUE);}private boolean check(TreeNode n,long lo,long hi){if(n==null)return true;if(n.val<=lo||n.val>=hi)return false;return check(n.left,lo,n.val)&&check(n.right,n.val,hi);} }
