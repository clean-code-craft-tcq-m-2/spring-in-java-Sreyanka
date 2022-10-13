package statisticker;

import java.util.List;

public class Statistics {
	public static class Stats {
		 Float max;
		 Float min;
		 Float average;
	}

	public static Stats getStatistics(List<Float> numbers) {
		// implement the computation of statistics here
		Stats statistics = new Stats();
		int numberSize = numbers.size();
		if (numberSize >= 1) {
			float total = statistics.max = statistics.min = numbers.get(0);
			for (int i = 1; i < numberSize; i++) {
				float number = numbers.get(i);
				if (number > statistics.max) {
					statistics.max = number;
				}
				if (number < statistics.min) {
					statistics.min = number;
				}
				total = total + number;
			}
			statistics.average = total / numberSize;
		} else {
			statistics.max = statistics.min = statistics.average = Float.NaN;
		}
		return statistics;
	}

}
