// LeetCode: Longest Substring Without Repeating Characters
// Submit this class in the matching LeetCode problem.
import java.util.*;
class Solution { public int lengthOfLongestSubstring(String s){Map<Character,Integer> m=new HashMap<>();int left=0,best=0;for(int r=0;r<s.length();r++){char c=s.charAt(r);if(m.containsKey(c))left=Math.max(left,m.get(c)+1);m.put(c,r);best=Math.max(best,r-left+1);}return best;} }
