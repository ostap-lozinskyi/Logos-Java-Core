package work20;

public class MyThread extends Thread {
	private final int length;
	private final Fibonacci fibonacci = new Fibonacci();

	public MyThread(int length) {
		this.length = length;
	}

	// @Override
	public void run() {
		int printedFibonacci[] = fibonacci.fibonacci(length);
		for (int i : printedFibonacci) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
