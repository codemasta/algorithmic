package io.teivah.cracking.arrays;

public class E4 {
  public boolean isPermutationPalindrome(String s) {
    int bitVector = createBitVector(s);
//    System.out.println(Integer.toBinaryString(bitVector));

    int count = 0;
    for (int i = 0; i < 32; i++) {
      boolean bit = getBit(bitVector, i);
      if (bit) {
        count++;
        if (count > 1) {
          return false;
        }
      }
    }

    return true;
  }

  public boolean getBit(int bitVector, int index) {
    return (bitVector & (1 << index)) != 0;
  }

  int flipBit(final int bitVector, final int i) {
    return bitVector ^ (1 << i);
  }

  public int createBitVector(String s) {
    char[] c = s.toCharArray();
    int bitVector = 0;
    for (int i = 0; i < c.length; i++) {
      bitVector = flipBit(bitVector, c[i] - 'a');
    }

    return bitVector;
  }
}
