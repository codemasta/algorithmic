package io.teivah.arrays.maxdistance;

import java.util.List;

public class MaxDistance {
	public int maximumGap(final List<Integer> list) {
		if(list.size() <= 1) {
			return -1;
		}

		if(list.get(0) <= list.get(list.size() - 1)) {
			return list.size() - 1;
		}

		return Math.max(
				maximumGap(list.subList(0, list.size() - 1)),
				maximumGap(list.subList(1, list.size()))
		);
	}
}
