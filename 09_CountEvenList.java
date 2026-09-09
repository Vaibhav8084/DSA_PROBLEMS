// Count Even List.
import java.util.ArrayList;
class CountEvenList {
 public static void main(String[] args) {
  ArrayList<Integer> a=new ArrayList<>(java.util.Arrays.asList(2,7,10,13)); int c=0; for(int x:a)if(x%2==0)c++; System.out.println(c);
 }
}
