// LeetCode: House Robber
// Submit this class in the matching LeetCode problem.
class Solution { public int rob(int[] nums){int a=0,b=0;for(int x:nums){int c=Math.max(b,a+x);a=b;b=c;}return b;} }
