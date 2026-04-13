package by.vsu;

import static java.lang.Math.*;

public class Normalizer {
	public static double nightNorm(double x) {
		return pow(x / 320, 1.75);
	}

	public static double morningNorm(double x) {
		return 5237 * pow(log(pow(x, 0.25) + 1), 4);
	}

	public static double dayNorm(double x) {
		return 835 * sqrt(x);
	}

	public static double eveningNorm(double x) {
		return pow(x, 1.25) * exp(sin(1.5 * x / PI) / 20) / 30;
	}
}
