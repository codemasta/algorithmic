package io.teivah.arrays.hotelbookings;

import org.junit.jupiter.api.Test;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		assertEquals(false, new Solution().hotel(
				toArrayList(1, 3, 5),
				toArrayList(2, 6, 8),
				1
		));
	}

	@Test
	public void test2() {
		assertEquals(true, new Solution().hotel(
				toArrayList(1, 1, 1),
				toArrayList(2, 3, 2),
				3
		));
	}
}
