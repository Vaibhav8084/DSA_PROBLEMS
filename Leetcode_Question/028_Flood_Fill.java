// LeetCode: Flood Fill
// Submit this class in the matching LeetCode problem.
class Solution { public int[][] floodFill(int[][] image,int sr,int sc,int color){int old=image[sr][sc];if(old==color)return image;fill(image,sr,sc,old,color);return image;}private void fill(int[][] a,int r,int c,int old,int color){if(r<0||r==a.length||c<0||c==a[0].length||a[r][c]!=old)return;a[r][c]=color;fill(a,r+1,c,old,color);fill(a,r-1,c,old,color);fill(a,r,c+1,old,color);fill(a,r,c-1,old,color);} }
