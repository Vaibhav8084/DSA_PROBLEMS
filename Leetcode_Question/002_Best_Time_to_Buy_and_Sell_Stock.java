// LeetCode: Best Time to Buy and Sell Stock
// Submit this class in the matching LeetCode problem.
class Solution { public int maxProfit(int[] prices){int low=Integer.MAX_VALUE,ans=0; for(int p:prices){low=Math.min(low,p);ans=Math.max(ans,p-low);} return ans;} }
