// LeetCode: Top K Frequent Elements
// Submit this class in the matching LeetCode problem.
import java.util.*;
class Solution { public int[] topKFrequent(int[] nums,int k){Map<Integer,Integer> m=new HashMap<>();for(int x:nums)m.put(x,m.getOrDefault(x,0)+1);PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->m.get(a)-m.get(b));for(int x:m.keySet()){q.offer(x);if(q.size()>k)q.poll();}int[] out=new int[k];for(int i=k-1;i>=0;i--)out[i]=q.poll();return out;} }
