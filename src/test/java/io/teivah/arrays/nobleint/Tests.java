package io.teivah.arrays.nobleint;

import org.junit.jupiter.api.Test;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		assertEquals(1, new Solution().solve(toArrayList(-4, -2, 0, -1, -6)));
	}
}
