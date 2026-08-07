// LeetCode: Rotate Array
// Submit this class in the matching LeetCode problem.
class Solution { public void rotate(int[] nums,int k){int n=nums.length;k%=n;rev(nums,0,n-1);rev(nums,0,k-1);rev(nums,k,n-1);}private void rev(int[] a,int l,int r){while(l<r){int t=a[l];a[l++]=a[r];a[r--]=t;}} }
