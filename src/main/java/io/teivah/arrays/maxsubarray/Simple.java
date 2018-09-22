package io.teivah.arrays.maxsubarray;

import java.util.List;

public class Simple {
	public int maxSubArray(final List<Integer> list) {
		int max = Integer.MIN_VALUE;
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			// Increment the counter with the current value
			count = count + list.get(i);

			if (count > max) {
				max = count;
			}

			// If count is negative, we simply get rid of the past
			if (count < 0) {
				count = 0;
			}
		}
		return max;
	}
}
