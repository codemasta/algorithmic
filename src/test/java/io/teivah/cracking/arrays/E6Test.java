package io.teivah.cracking.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class E6Test {
  @Test
  public void test1() {
    assertEquals("a2b1c5a3", new E6().stringCompression("aabcccccaaa"));
  }

  @Test
  public void test2() {
    assertEquals("abcde", new E6().stringCompression("abcde"));
  }
}
