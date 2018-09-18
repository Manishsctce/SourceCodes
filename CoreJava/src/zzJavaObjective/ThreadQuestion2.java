package zzJavaObjective;

public class ThreadQuestion2 {
	private static class MyThread extends Thread {
		public MyThread(String name) {
			super(name);
		}

		public void run() {

			System.out.println(Thread.currentThread().getName());//main

		}

	}
	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread");
		myThread.run();//

	}

}
