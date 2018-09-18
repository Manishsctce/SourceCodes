package zzJavaObjective;

public class Ques11 {

	public static void main(String[] args) {
		final class Constant{
			public final String PI="3.14";
		}

		Thread t = new Thread( new Runnable(){
			@Override
			public void run(){
				System.out.println(Constant.PI);
			}
		}
		);
		
		t.start();
	}
}
