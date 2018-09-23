package io.teivah.arrays.nobleint;

import org.junit.jupiter.api.Test;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		assertEquals(1, new Solution().solve(toArrayList(2, 6, 1, 3)));
	}

	@Test
	public void test2() {
		assertEquals(-1, new Solution().solve(toArrayList(1, 2, 2, 3)));
	}
}
