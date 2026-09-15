// Join Words.
import java.util.ArrayList;
class JoinWords {
 public static void main(String[] args) {
  ArrayList<String> a=new ArrayList<>(java.util.Arrays.asList("Java","is","fun")); String t=""; for(String x:a)t+=x+" "; System.out.println(t.trim());
 }
}
