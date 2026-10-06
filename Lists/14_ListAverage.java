// List Average.
import java.util.ArrayList;
class ListAverage {
 public static void main(String[] args) {
  ArrayList<Integer> a=new ArrayList<>(java.util.Arrays.asList(8,12,16)); int s=0; for(int x:a)s+=x; System.out.println((double)s/a.size());
 }
}
