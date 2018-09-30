package io.teivah.arrays.findduplicate;

import org.junit.jupiter.api.Test;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		assertEquals(4, new Negative().repeatedNumber(
				toArrayList(3, 4, 1, 4, 1)
		));
		assertEquals(4, new SlowFast().repeatedNumber(
				toArrayList(3, 4, 1, 4, 1)
		));
	}

	@Test
	public void test2() {
		assertEquals(3, new Negative().repeatedNumber(
				toArrayList(1, 2, 3, 3)
		));
		assertEquals(3, new SlowFast().repeatedNumber(
				toArrayList(1, 2, 3, 3)
		));
	}

	@Test
	public void test3() {
		assertEquals(3, new Negative().repeatedNumber(
				toArrayList(3, 3, 1, 2, 4)
		));
		assertEquals(3, new SlowFast().repeatedNumber(
				toArrayList(3, 3, 1, 2, 4)
		));
	}
}
