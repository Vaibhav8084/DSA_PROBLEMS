// Clear List.
import java.util.ArrayList;
class ClearList {
 public static void main(String[] args) {
  ArrayList<String> a=new ArrayList<>(java.util.Arrays.asList("tea","coffee")); a.clear(); System.out.println(a.isEmpty());
 }
}
