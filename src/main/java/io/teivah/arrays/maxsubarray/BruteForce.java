package io.teivah.arrays.maxsubarray;

import java.util.List;

public class BruteForce {
	public int maxSubArray(List<Integer> list) {
		// Iterate over the list and sum each element
		int count = getTotalCount(list);

		return maxSubArray(list, 0, list.size() - 1, count);
	}

	public int maxSubArray(List<Integer> list, int left, int right, int count) {
		if (left >= right) {
			return count;
		}

		// Get value without the first element
		int withoutFirst =
				maxSubArray(list, left + 1, right, count - list.get(left));
		// Get value without the last element
		int withoutLast =
				maxSubArray(list, left, right - 1, count - list.get(right));

		// Return the max between the current sum and the two previously computed values
		return Math.max(count, Math.max(withoutFirst, withoutLast));
	}

	private int getTotalCount(List<Integer> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			count += list.get(i);
		}
		return count;
	}
}
