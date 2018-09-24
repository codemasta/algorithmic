package io.teivah.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class Utils {
	public static <T> ArrayList toArrayList(T... n) {
		return new ArrayList<>(Arrays.asList(n));
	}
}
