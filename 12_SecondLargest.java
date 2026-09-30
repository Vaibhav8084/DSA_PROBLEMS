// Second Largest.
class SecondLargest {
 public static void main(String[] args) {
  int[] a={7,12,4,9}; int m=Integer.MIN_VALUE,n=m; for(int x:a)if(x>m){n=m;m=x;}else if(x>n&&x!=m)n=x; System.out.println(n);
 }
}
