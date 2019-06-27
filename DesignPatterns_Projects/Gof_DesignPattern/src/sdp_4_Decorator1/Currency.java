package sdp_4_Decorator1;

public abstract class Currency {
	String description = "Unknown currency";

	public String getCurrencyDescription() {
		return description;
	}

	public abstract double cost(double value);

}