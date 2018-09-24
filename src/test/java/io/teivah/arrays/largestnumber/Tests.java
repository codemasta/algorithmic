package io.teivah.arrays.largestnumber;

import org.junit.jupiter.api.Test;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		assertEquals("9534330", new Solution().largestNumber(
				toArrayList(3, 30, 34, 5, 9)));
	}

	@Test
	public void test2() {
		assertEquals("0", new Solution().largestNumber(
				toArrayList(0, 0, 0, 0, 0)));
	}

	@Test
	public void test3() {
		assertEquals("12121", new Solution().largestNumber(
				toArrayList(12, 121)));
	}
}
