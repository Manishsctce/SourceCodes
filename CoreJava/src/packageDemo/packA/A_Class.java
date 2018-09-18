package packageDemo.packA;

public class A_Class {
	private int privateVar;
	int defaultVar;
	protected static int protectedVar;
	public int publicVar;
	
	int getPrivateVar() {
		return privateVar;
	}
	void setPrivateVar(int privateVar) {
		this.privateVar = privateVar;
	}
	int getDefaultVar() {
		return defaultVar;
	}
	void setDefaultVar(int defaultVar) {
		this.defaultVar = defaultVar;
	}
	protected int getProtectedVar() {
		return protectedVar;
	}
	protected void setProtectedVar(int protectedVar) {
		this.protectedVar = protectedVar;
	}
	public int getPublicVar() {
		return publicVar;
	}
	public void setPublicVar(int publicVar) {
		this.publicVar = publicVar;
	}
	
	
}
