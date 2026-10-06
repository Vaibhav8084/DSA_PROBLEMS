// Reverse In Place.
class ReverseInPlace {
 public static void main(String[] args) {
  int[] a={2,4,6,8}; for(int i=0,j=3;i<j;i++,j--){int t=a[i];a[i]=a[j];a[j]=t;} System.out.println(java.util.Arrays.toString(a));
 }
}
