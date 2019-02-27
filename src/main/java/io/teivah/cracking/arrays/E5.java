package io.teivah.cracking.arrays;

public class E5 {
  public boolean oneAway(String s1, String s2) {
    int l1 = s1.length();
    int l2 = s2.length();

    if (l1 == l2) {
      return checkReplace(s1, s2);
    } else if (l1 + 1 == l2) {
      return checkInsert(s1, s2);
    } else if (l1 - 1 == l2) {
      return checkInsert(s2, s1);
    }

    return false;
  }

  public boolean checkReplace(String s1, String s2) {
    int i = 0, j = 0;
    boolean differences = false;
    while (i < s1.length() && j < s2.length()) {
      if (s1.charAt(i) != s2.charAt(j)) {
        if (differences) {
          return false;
        }
        differences = true;
      }
      i++;
      j++;
    }

    return true;
  }

  // little, big
  public boolean checkInsert(String s1, String s2) {
    int i = 0, j = 0;
    boolean differences = false;
    while (i < s1.length() && j < s2.length()) {
      if (s1.charAt(i) != s2.charAt(j)) {
        if (differences) {
          return false;
        }
        differences = true;
      } else {
        i++;
      }
      j++;
    }

    return true;
  }
}
