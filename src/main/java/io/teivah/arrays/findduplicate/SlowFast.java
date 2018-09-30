package io.teivah.arrays.findduplicate;

import java.util.List;

public class SlowFast {
	public int repeatedNumber(final List<Integer> a) {
		if (a.size() <= 1)
			return -1;

		int slow = a.get(0);
		int fast = a.get(a.get(0));

		while (fast != slow) {
			slow = a.get(slow);
			fast = a.get(a.get(fast));
		}

		fast = 0;
		while (fast != slow) {
			slow = a.get(slow);
			fast = a.get(fast);
		}
		return slow;
	}
}
