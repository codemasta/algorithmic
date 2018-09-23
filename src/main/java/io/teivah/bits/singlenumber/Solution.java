package io.teivah.bits.singlenumber;

import java.util.List;

public class Solution {
	public int singleNumber(final List<Integer> list) {
		int result = 0;

		// From 0 to Integer.SIZE (32)
		int bitPosition = 1;
		for (int i = 0; i < Integer.SIZE; i++) {
			int count = 0;

			// For each element
			for (int j = 0; j < list.size(); j++) {
				// Current element AND bitPosition
				if ((list.get(j) & bitPosition) != 0) {
					count++;
				}
			}

			// If the result modulo 3 is different from 0
			// It means this bit appeared only once
			// So we have to store it
			if (count % 3 != 0) {
				result |= bitPosition;
			}

			// Shift the bit to the left
			bitPosition <<= 1;
		}

		return result;
	}
}
