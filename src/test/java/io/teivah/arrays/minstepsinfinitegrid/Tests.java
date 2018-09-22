package io.teivah.arrays.minstepsinfinitegrid;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		final ArrayList<Integer> x = toArrayList(-7, -13);
		final ArrayList<Integer> y = toArrayList(1, -5);

		final int i = new Traversal().coverPoints(x, y);
		assertEquals(i, 6);
	}

}
