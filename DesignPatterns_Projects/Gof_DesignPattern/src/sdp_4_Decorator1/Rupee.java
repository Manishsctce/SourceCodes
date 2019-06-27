package sdp_4_Decorator1;

public class Rupee extends Currency {
	double value;

	public Rupee() {
		description = "indian rupees";
	}

	public double cost(double v) {
		value = v;
		return value;
	}
}
