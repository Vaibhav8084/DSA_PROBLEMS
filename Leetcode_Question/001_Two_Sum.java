// LeetCode: Two Sum
// Submit this class in the matching LeetCode problem.
import java.util.*;
class Solution { public int[] twoSum(int[] nums,int target){Map<Integer,Integer> m=new HashMap<>(); for(int i=0;i<nums.length;i++){int need=target-nums[i]; if(m.containsKey(need))return new int[]{m.get(need),i}; m.put(nums[i],i);} return new int[0];} }
