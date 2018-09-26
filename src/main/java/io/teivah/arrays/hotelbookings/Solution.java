package io.teivah.arrays.hotelbookings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public boolean hotel(ArrayList<Integer> arrivals, ArrayList<Integer> departures, int k) {
		// Collection of events
		Map<Integer, Integer> events = new HashMap<>();

		// Number of rooms
		int n = arrivals.size();

		for (int i = 0; i < n; i++) {
			int arrival = arrivals.get(i);
			int departure = departures.get(i);

			// Add one during an arrival
			Integer current = events.get(arrival);
			events.put(arrival, current == null ? 1 : current + 1);

			// Remove one during a departure
			current = events.get(departure);
			events.put(departure, current == null ? -1 : current - 1);
		}

		// Sort the map
		Map<Integer, Integer> sortedEvents = new TreeMap<>(events);

		int count = 0;
		for (Map.Entry<Integer, Integer> entry : sortedEvents.entrySet()) {
			count += entry.getValue();

			// If the current count exceeds the maximum number of rooms
			if (count > k) {
				return false;
			}
		}

		return true;
	}
}
