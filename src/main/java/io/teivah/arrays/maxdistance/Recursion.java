package io.teivah.arrays.maxdistance;

import java.util.List;

public class Recursion {
	public int maximumGap(final List<Integer> list) {
		int size = list.size();

		if (size <= 1) {
			return -1;
		}

		if (list.get(0) <= list.get(size - 1)) {
			return size - 1;
		}

		// Max between list[0:size-1] and list[1:size]
		return Math.max(
				maximumGap(list.subList(0, size - 1)),
				maximumGap(list.subList(1, size))
		);
	}
}
