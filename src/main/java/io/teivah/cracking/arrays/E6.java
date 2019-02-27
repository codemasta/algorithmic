package io.teivah.cracking.arrays;

public class E6 {
  public String stringCompression(String s) {
    char[] chars = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      int count = 1;
      int j = i + 1;
      for (; j < chars.length; j++) {
        if (c == chars[j]) {
          count++;
        } else {
          sb.append(c).append(count);
          i = j - 1;
          break;
        }
      }

      if (j == chars.length) {
        sb.append(c).append(count);
        break;
      }
    }

    String s2 = sb.toString();
    System.out.println(s2);
    if (s2.length() > s.length()) {
      return s;
    } else {
      return s2;
    }
  }
}
