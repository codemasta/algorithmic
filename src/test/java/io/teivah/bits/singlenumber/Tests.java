package io.teivah.bits.singlenumber;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		final ArrayList<Integer> list = toArrayList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1);

		System.out.println(5 << 1);

		assertEquals(4, new Solution().singleNumber(list));
	}
}
