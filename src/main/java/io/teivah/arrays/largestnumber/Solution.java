package io.teivah.arrays.largestnumber;

import java.util.Arrays;
import java.util.List;

public class Solution {
	public String largestNumber(final List<Integer> list) {
		if (list == null || list.isEmpty()) {
			return "0";
		}

		StringBuilder sb = new StringBuilder();
		Container containers[] = new Container[list.size()];

		int index = 0;

		for (int n : list) {
			containers[index] = new Container(n);
			index++;
		}

		Arrays.sort(containers);

		if ("0".equals(containers[0].number)) {
			return "0";
		}

		for (Container n : containers) {
			sb.append(n.number);
		}

		return sb.toString();
	}

	class Container implements Comparable<Container> {
		String number;

		public Container(int number) {
			this.number = String.valueOf(number);
		}

		@Override
		public int compareTo(Container c) {
			String first = this.number + c.number;
			String second = c.number + this.number;

			return second.compareTo(first);
		}
	}
}
