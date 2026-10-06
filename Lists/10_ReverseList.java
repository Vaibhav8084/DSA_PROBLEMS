// Reverse List.
import java.util.ArrayList;
class ReverseList {
 public static void main(String[] args) {
  ArrayList<String> a=new ArrayList<>(java.util.Arrays.asList("one","two","three")); for(int i=a.size()-1;i>=0;i--)System.out.print(a.get(i)+" ");
 }
}
