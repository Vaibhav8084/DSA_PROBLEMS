// LeetCode: Container With Most Water
// Submit this class in the matching LeetCode problem.
class Solution { public int maxArea(int[] h){int l=0,r=h.length-1,best=0;while(l<r){best=Math.max(best,Math.min(h[l],h[r])*(r-l));if(h[l]<h[r])l++;else r--;}return best;} }
