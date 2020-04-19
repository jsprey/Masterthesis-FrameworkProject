package de.ovgu.featureide.sampling.eval.samplestability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sample extends ArrayList<List<String>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3606346823876818613L;

	public Sample() {
	}

	/**
	 * Copy constructor
	 * 
	 * @param sample sample to copy
	 */
	public Sample(Sample sample) {
		Collections.copy(this, sample);
	}

	public Sample omitNegatives() {
		Sample sample = new Sample();
		for (List<String> list : this) {
			sample.add(list.stream().filter(e -> !e.startsWith("-")).collect(Collectors.toList()));
		}
		return sample;
	}
}
