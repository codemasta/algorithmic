package io.teivah.arrays.findduplicate;

import java.util.List;

public class Negative {
	public int repeatedNumber(final List<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(Math.abs(a.get(i))) > 0) {
				a.set(Math.abs(a.get(i)), -1 * a.get(Math.abs(a.get(i))));
			} else {
				return Math.abs(a.get(i));
			}
		}

		return 0;
	}
}
