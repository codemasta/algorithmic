package io.teivah.arrays.nobleint;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public int solve(ArrayList<Integer> list) {
		// Sort the collection
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			// Check if the next element is a duplicate
			if (i < list.size() - 1 && list.get(i) == list.get(i + 1)) {
				continue;
			}

			// Check if a noble int
			if (list.size() - i - 1 == list.get(i)) {
				return 1;
			}
		}

		return -1;
	}
}
