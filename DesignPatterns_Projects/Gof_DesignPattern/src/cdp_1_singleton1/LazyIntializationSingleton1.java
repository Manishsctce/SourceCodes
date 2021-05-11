package cdp_1_singleton1;

class LazyIntialization{
	private LazyIntialization() {}
	private static volatile LazyIntialization INSTANCE = null;
	
	public static LazyIntialization getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new LazyIntialization();
		}
		return INSTANCE;
	}
}
public class LazyIntializationSingleton1{
	public static void main(String[] args) {
			Thread t1 = new Thread("Thread1") {
				public void run() {
					LazyIntialization t = LazyIntialization.getInstance();
					System.out.println(this.getName()+ " hashcode value: "+t.hashCode());
				}
			};
			Thread t2 = new Thread("Thread2") {
				public void run() {
					LazyIntialization t = LazyIntialization.getInstance();
					System.out.println(this.getName()+ " hashcode value: "+t.hashCode());
				}
			};
			Thread t3 = new Thread("Thread3") {
				public void run() {
					LazyIntialization t = LazyIntialization.getInstance();
					System.out.println(this.getName()+ " hashcode value: "+t.hashCode());
				}
			};
			Thread t4 = new Thread("Thread4") {
				public void run() {
					LazyIntialization t = LazyIntialization.getInstance();
					System.out.println(this.getName()+ " hashcode value: "+t.hashCode());
				}
			};
			t1.start();t2.start();t3.start();t4.start();		
		System.out.println("Exit");
	}
}
