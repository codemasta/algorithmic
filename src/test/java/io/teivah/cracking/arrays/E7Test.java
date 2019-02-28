package io.teivah.cracking.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class E7Test {
  @Test
  public void test() {
    int size = 3;
    int[][] m = new int[size][size];
    int count = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        m[i][j] = count++;
      }
    }

    int[][] expected = { { 6, 3, 0 }, { 7, 4, 1 }, { 8, 5, 2 } };
    new E7().rotateMatrix(m);
    assertArrayEquals(expected, m);
  }
}

