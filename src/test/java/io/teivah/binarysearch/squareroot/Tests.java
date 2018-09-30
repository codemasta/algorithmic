package io.teivah.binarysearch.squareroot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		assertEquals(3, new Solution().sqrt(9));
	}

	@Test
	public void test2() {
		assertEquals(3, new Solution().sqrt(11));
	}

	@Test
	public void test3() {
		assertEquals(46340, new Solution().sqrt(2147483647));
	}
}
