package io.teivah.arrays.hotelbookings;

import java.util.ArrayList;
import java.util.Collections;

public class Simple {
	public boolean hotel(ArrayList<Integer> arrivals, ArrayList<Integer> departures, int k) {
		// Sort both collections
		Collections.sort(arrivals);
		Collections.sort(departures);

		// Number of rooms
		int n = arrivals.size();

		int count = 0;
		int indexArrival = 0;
		int indexDeparture = 0;

		while (indexArrival < n && indexDeparture < n) {
			if (arrivals.get(indexArrival) < departures.get(indexDeparture)) {
				indexArrival++;
				count++;

				// If the current count exceeds the maximum number of rooms
				if (count > k) {
					return false;
				}
			} else {
				indexDeparture++;
				count--;
			}
		}

		return true;
	}
}
