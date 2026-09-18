// Longest Word.
import java.util.ArrayList;
class LongestWord {
 public static void main(String[] args) {
  ArrayList<String> a=new ArrayList<>(java.util.Arrays.asList("cat","elephant","tiger")); String w=a.get(0); for(String x:a)if(x.length()>w.length())w=x; System.out.println(w);
 }
}
