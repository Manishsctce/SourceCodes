package cdp_1_singleton1;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance = null;
	 private ThreadSafeSingleton() {}
	 
	 public static synchronized ThreadSafeSingleton getInstance() {
	   if (instance == null) {
	     instance = new ThreadSafeSingleton();
	   }
	   return instance;
	 }
	 
	public static void main(String[] args) {
		Thread t1 = new Thread("Thread1") {
			public void run() {
				ThreadSafeSingleton t = ThreadSafeSingleton.getInstance();
				System.out.println(this.getName()+ " hashcode value: "+t.hashCode());
			}
		};
		Thread t2 = new Thread("Thread2") {
			public void run() {
				ThreadSafeSingleton t = ThreadSafeSingleton.getInstance();
				System.out.println(this.getName()+ " hashcode value: "+t.hashCode());
			}
		};

		Thread t3 = new Thread("Thread3") {
			public void run() {
				ThreadSafeSingleton t = ThreadSafeSingleton.getInstance();
				System.out.println(this.getName()+ " hashcode value: "+t.hashCode());
			}
		};
		Thread t4 = new Thread("Thread4") {
			public void run() {
				ThreadSafeSingleton t = ThreadSafeSingleton.getInstance();
				System.out.println(this.getName()+ " hashcode value: "+t.hashCode());
			}
		};
		t1.start();t2.start();t3.start();t4.start();
	}

}
