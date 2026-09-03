// Largest In List.
import java.util.ArrayList;
class LargestInList {
 public static void main(String[] args) {
  ArrayList<Integer> a=new ArrayList<>(java.util.Arrays.asList(12,5,21)); int m=a.get(0); for(int x:a)if(x>m)m=x; System.out.println(m);
 }
}
