// LeetCode: Number of Islands
// Submit this class in the matching LeetCode problem.
class Solution { public int numIslands(char[][] a){int count=0;for(int r=0;r<a.length;r++)for(int c=0;c<a[0].length;c++)if(a[r][c]=='1'){count++;sink(a,r,c);}return count;}private void sink(char[][] a,int r,int c){if(r<0||r==a.length||c<0||c==a[0].length||a[r][c]!='1')return;a[r][c]='0';sink(a,r+1,c);sink(a,r-1,c);sink(a,r,c+1);sink(a,r,c-1);} }
