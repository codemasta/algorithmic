package io.teivah.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class Utils {
	public static ArrayList<Integer> toArrayList(Integer... n) {
		return new ArrayList<>(Arrays.asList(n));
	}
}
