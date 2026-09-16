// List To Array.
import java.util.ArrayList;
class ListToArray {
 public static void main(String[] args) {
  ArrayList<Integer> a=new ArrayList<>(java.util.Arrays.asList(5,10,15)); int[] b=new int[a.size()]; for(int i=0;i<a.size();i++)b[i]=a.get(i); System.out.println(java.util.Arrays.toString(b));
 }
}
