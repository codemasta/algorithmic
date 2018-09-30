package io.teivah.binarysearch.squareroot;

public class Solution {
	public int sqrt(int a) {
		long low = 1, high = a;
		System.out.println(Integer.MAX_VALUE);
		while (low <= high) {
			long mid = (high + low) / 2;
			long n = mid * mid;

			if (n == a) {
				return (int) mid;
			} else if (n < a) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return (int) high;
	}
}
