// Remove Duplicates.
import java.util.ArrayList;
class RemoveDuplicates {
 public static void main(String[] args) {
  ArrayList<Integer> a=new ArrayList<>(java.util.Arrays.asList(2,4,2,7)),b=new ArrayList<>(); for(int x:a)if(!b.contains(x))b.add(x); System.out.println(b);
 }
}
