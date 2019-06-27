package sdp_4_Decorator1;

public class SGDDecorator extends Decorator{
	Currency currency;
	
	public SGDDecorator(Currency currency){
		this.currency = currency;
	}
	public String getDescription(){
		return currency.getCurrencyDescription()+" ,its singapore Dollar";
	}
	
	public double cost(double value) {
		// TODO Auto-generated method stub
		return 60;
	}
}
