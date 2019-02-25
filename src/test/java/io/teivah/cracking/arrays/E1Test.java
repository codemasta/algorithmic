package io.teivah.cracking.arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class E1Test {
  @Test
  public void test() {
    final E1 e = new E1();
    char[] c = new char[128];
    for (int i = 0; i < 125; i++) {
      c[i] = (char) i;
    }
    boolean got = e.e1(new String(c));
    assertTrue(got);
  }
}
