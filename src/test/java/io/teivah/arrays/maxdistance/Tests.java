package io.teivah.arrays.maxdistance;

import io.teivah.arrays.hotelbookings.Simple;
import io.teivah.arrays.hotelbookings.Solution;
import org.junit.jupiter.api.Test;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		assertEquals(2, new MaxDistance().
				maximumGap(toArrayList(3, 5, 4, 2)));
	}
}
