package bdp_03_chainofresponsibility1;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);	
	void dispense(Currency cur);
}