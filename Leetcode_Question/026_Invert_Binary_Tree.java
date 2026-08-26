// LeetCode: Invert Binary Tree
// Submit this class in the matching LeetCode problem.
class Solution { public TreeNode invertTree(TreeNode root){if(root==null)return null;TreeNode t=root.left;root.left=invertTree(root.right);root.right=invertTree(t);return root;} }
