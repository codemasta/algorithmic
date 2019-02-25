package io.teivah.cracking.arrays;

public class E1 {
  public boolean e1(String s) {
    // If ASCII => 128 characters
    long[] vector = new long[2];
    final int length = s.length();
    for (int i = 0; i < length; i++) {
      int c = s.charAt(i);
      if (c < 64) {
        vector[0] = setBit(vector[0], c);
      } else {
        c = c - 64;
        vector[1] = setBit(vector[1], c);
      }
    }

    System.out.println(Long.toBinaryString(vector[0]));
    System.out.println(Long.toBinaryString(vector[1]));

    return check(vector[0]) && check(vector[1]);
  }

  private boolean check(long v) {
    for (int i = 0; i < 64; i++) {
      if (!getBit(v, i)) {
        return false;
      }
    }

    return true;
  }

  boolean getBit(final long num, final int i) {
    return ((num & (1 << i)) != 0);
  }

  long setBit(final long num, final int i) {
    return num | (1 << i);
  }
}
