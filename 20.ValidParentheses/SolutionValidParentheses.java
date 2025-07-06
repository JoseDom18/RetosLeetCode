import java.util.HashMap;
import java.util.Map;

public class SolutionValidParentheses {
  public boolean isValid(String s) {

    boolean wltl = true;
    char[] palabra = s.toCharArray();

    Map<Character, Integer> map = new HashMap<>();

    for (char a : palabra) {
      map.put(a, map.getOrDefault(a, 0) + 1);
    }

    if ((map.getOrDefault('(', 0) - map.getOrDefault(')', 0) == 0)
        && (map.getOrDefault('[', 0) - map.getOrDefault(']', 0) == 0)
        && (map.getOrDefault('{', 0) - map.getOrDefault('}', 0) == 0)) {
      System.out.println("Es momento de analizar");
    } else {
      wltl = false;
    }



    
    
    return wltl;

  }
}
