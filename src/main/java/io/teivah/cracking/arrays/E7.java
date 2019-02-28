package io.teivah.cracking.arrays;

public class E7 {
  public void rotateMatrix(int[][] m) {
    int n = m.length - 1;

    // Handle level by level
    for (int i = 0; i <= n / 2; i++) {
      for (int j = i; j < n - i; j++) {
        int p1 = m[i][j];
        int p2 = m[j][n - i];
        int p3 = m[n - i][n - j];
        int p4 = m[n - j][i];

        m[j][n - i] = p1;
        m[n - i][n - j] = p2;
        m[n - j][i] = p3;
        m[i][j] = p4;
      }
    }
  }
}
