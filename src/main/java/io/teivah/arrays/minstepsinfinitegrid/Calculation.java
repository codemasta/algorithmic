package io.teivah.arrays.minstepsinfinitegrid;

import java.util.ArrayList;

public class Calculation {
	public int coverPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
		// Get current x and y
		int curX = x.get(0);
		int curY = y.get(0);
		// Counter
		int count = 0;

		for (int i = 1; i < x.size(); i++) {
			// Get destination x and y
			int dstX = x.get(i);
			int dstY = y.get(i);

			// Compute count according to the number of moves required
			count += Math.max(
					Math.abs(dstX - curX),
					Math.abs(dstY - curY)
			);

			// Update the current position
			curX = dstX;
			curY = dstY;
		}

		return count;
	}
}
