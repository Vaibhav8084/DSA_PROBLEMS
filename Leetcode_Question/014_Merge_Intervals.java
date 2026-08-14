// LeetCode: Merge Intervals
// Submit this class in the matching LeetCode problem.
import java.util.*;
class Solution { public int[][] merge(int[][] a){if(a.length==0)return a;Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));List<int[]> out=new ArrayList<>();int[] cur=a[0];for(int i=1;i<a.length;i++){if(a[i][0]<=cur[1])cur[1]=Math.max(cur[1],a[i][1]);else{out.add(cur);cur=a[i];}}out.add(cur);return out.toArray(new int[out.size()][]);} }
