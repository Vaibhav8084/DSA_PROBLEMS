// LeetCode: Move Zeroes
// Submit this class in the matching LeetCode problem.
class Solution { public void moveZeroes(int[] nums){int j=0;for(int x:nums)if(x!=0)nums[j++]=x;while(j<nums.length)nums[j++]=0;} }
