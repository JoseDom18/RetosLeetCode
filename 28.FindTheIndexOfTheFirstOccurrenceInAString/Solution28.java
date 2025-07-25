public class Solution28 {
  public int strStr(String haystack, String needle) {
    int res = 0;
    int j = 0;
    char[] needChar = needle.toCharArray();
    char[] hayChar = haystack.toCharArray();

    if (haystack.length() < needle.length()) {
      return -1;
    }
    for (int i = 0; i < haystack.length(); i++) {
      if (hayChar[i] == needChar[j]) {
        if (j == 0) {
          res = i;
        }
        if (j == needChar.length) {
          return res;
        }
        j++;
      } else {
        j = 0;
      }
    }
    return -1;
  }
}
