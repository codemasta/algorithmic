package io.teivah.arrays.minstepsinfinitegrid;

import java.util.ArrayList;

public class Traversal {
	public int coverPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
		int curX = x.get(0);
		int curY = y.get(0);
		int count = 0;

		for (int i = 1; i < x.size(); i++) {
			int dstX = x.get(i);
			int dstY = y.get(i);

			if(curX == dstX && curY == dstY) {
				break;
			}

			if(curX < dstX) curX++;
			else if(curX > dstX) curX--;

			if(curY < dstY) curY++;
			else if(curY > dstY) curY--;

			count++;
		}

		return count;
	}
}
