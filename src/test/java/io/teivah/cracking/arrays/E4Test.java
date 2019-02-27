package io.teivah.cracking.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class E4Test {
  @Test
  public void test1() {
    final E4 e = new E4();
    assertFalse(e.isPermutationPalindrome("abcd"));
  }

  @Test
  public void test2() {
    final E4 e = new E4();
    assertTrue(e.isPermutationPalindrome("abxab"));
  }

  @Test
  public void test3() {
    final E4 e = new E4();
    assertFalse(e.isPermutationPalindrome("abcax"));
  }
}
