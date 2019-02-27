package io.teivah.cracking.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class E5Test {
  @Test
  public void test1() {
    assertTrue(new E5().oneAway("pale", "ple"));
  }

  @Test
  public void test2() {
    assertTrue(new E5().oneAway("pales", "pale"));
  }

  @Test
  public void test3() {
    assertTrue(new E5().oneAway("pale", "bale"));
  }

  @Test
  public void test4() {
    assertFalse(new E5().oneAway("pale", "bae"));
  }
}
