public class SolutionLongestCommonPrefix {

  public static String longestCommonPrefix(String[] strs) {
    StringBuilder respuesta = new StringBuilder();
    int numeroCaracter = 0;
    int limite = strs.length;
    char[] word0 = strs[0].toCharArray();
    boolean isTrue = true;

    while (isTrue) {
      for (int i = 0; i < limite; i++) {
        char[] wordX = strs[i].toCharArray();
        if (word0[numeroCaracter] != wordX[numeroCaracter]) {
          isTrue = false;
          break;
        } else {
        }
      }
      if (isTrue) {
        respuesta.append(word0[numeroCaracter]);
      }
      numeroCaracter += 1;
    }

    return respuesta.toString();
  }
}
