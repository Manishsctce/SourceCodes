package thread.scenarioBasedQues;

/*
 * T1 T2 T3 
 * 1  2  3  
 * 4  5  6 
 * 7  8  9
 * 10
 * 
 * T1 T2 T3 T4
 * 1  2  3  4
 * 5  6  7  8
 * 9  10
 * 
 */

public class PrintNumbersUsing3Thread {
	private static final int TOTAL_NUMBER_TO_PRINT = 10;
	private static final int DIVIDER = 3;

	public static void main(String[] args) {
		NumbersGenerator numbersGenerator = new NumbersGenerator(DIVIDER, TOTAL_NUMBER_TO_PRINT);

		// Created three Threads
		Thread t1 = new Thread(new SequenceGeneratorTask(numbersGenerator, 1), "Thread-1");
		Thread t2 = new Thread(new SequenceGeneratorTask(numbersGenerator, 2), "Thread-2");
		Thread t3 = new Thread(new SequenceGeneratorTask(numbersGenerator, 0), "Thread-3");
		
		//Thread t4 = new Thread(new SequenceGeneratorTask(numbersGenerator, 1), "Thread-4");

		// Start all three threads
		t1.start();
		t2.start();
		t3.start();
		//t4.start();

	}
}

class SequenceGeneratorTask implements Runnable {

	private NumbersGenerator numbersGenerator;
	private int match;

	public SequenceGeneratorTask(NumbersGenerator numbersGenerator, int match) {
		super();
		this.numbersGenerator = numbersGenerator;
		this.match = match;
	}

	@Override
	public void run() {
		numbersGenerator.printNumbers(match);
	}
}

class NumbersGenerator {

	private int number = 1;
	private int divider;
	private int totalNumbersToPrint;

	public NumbersGenerator(int divider, int totalNumbersToPrint) {
		super();
		this.divider = divider;
		this.totalNumbersToPrint = totalNumbersToPrint;
	}

	public void printNumbers(int match) {
		synchronized (this) {
			while (number < totalNumbersToPrint - 1) {
				while (number % divider != match) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " " + number++);
				notifyAll();
			}
		}
	}
}