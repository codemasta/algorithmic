package io.teivah.arrays.maxdistance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public int maximumGap(final List<Integer> list) {
		int size = list.size();

		List<Helper> helpers = new ArrayList<>(size);

		// Add each element into an helper array
		for (int i = 0; i < size; i++) {
			helpers.add(new Helper(list.get(i), i));
		}

		// Sort the helper array
		Collections.sort(helpers);

		int[] rightMax = new int[size];
		int maxValue = Integer.MIN_VALUE;

		// Store the max value from the right to the left
		for (int i = size - 1; i >= 0; i--) {
			maxValue = Math.max(maxValue, helpers.get(i).index);
			rightMax[i] = maxValue;
		}

		int maxDiff = Integer.MIN_VALUE;

		// Iterate over helper and check the diff value
		for (int i = 0; i < size; i++) {
			maxDiff = Math.max(maxDiff, rightMax[i] - helpers.get(i).index);
		}

		return maxDiff;
	}

	class Helper implements Comparable<Helper> {
		int value;
		int index;

		public Helper(int value, int index) {
			this.value = value;
			this.index = index;
		}

		@Override
		public int compareTo(Helper helper) {
			// Comparison on the value

			if (value < helper.value) {
				return -1;
			} else if (value == helper.value) {
				return 0;
			} else {
				return 1;
			}
		}
	}
}
