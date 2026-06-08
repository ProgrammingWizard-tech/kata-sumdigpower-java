package de.cas.mse.exercise;

import java.util.ArrayList;
import java.util.List;

public class SpecialNumbersFinder {

	public List<Long> collectSpecialNumbers(long searchIntervalMin, long searchIntervalMax) {
		List<Long> result = new ArrayList<Long>();

		for (long i = searchIntervalMin; i < searchIntervalMax; i++) {
			if(isSpecialNumber(i)){
				result.add(i);
			}
		}
		return result;
	}

	private boolean isSpecialNumber(long number) {
		List<Integer> digits = getDigits(number);
		long sum = 0;

		for (int i = 0; i < digits.size(); i++) {
			int power = i+1;
			sum += Math.pow(digits.get(i), power);
		}
		return sum == number;
	}

	private List<Integer> getDigits(long number) {
		List<Integer> digits = new ArrayList<Integer>();
		String numberAsString = Long.toString(number);

		for (int i = 0; i < numberAsString.length(); i++) {
			String digitAsString = numberAsString.substring(i, i + 1);
			digits.add(Integer.valueOf(digitAsString));
		}
		return digits;
	}
}