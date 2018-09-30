package io.teivah.binarysearch.squareroot;

public class Solution {
	public int sqrt(int a) {
		long low = 1, high = a;

		while (low <= high) {
			long mid = (high + low) / 2;
			long current = mid * mid;

			if (current == a) {
				return (int) mid;
			} else if (current < a) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return (int) high;
	}
}
