package bdp_3_chainofresponsibility1;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);	
	void dispense(Currency cur);
}