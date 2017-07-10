package work20;

public class RunnableThread implements Runnable {
	private final int length;
	private final Fibonacci fibonacci = new Fibonacci();

	public RunnableThread(int length) {
		this.length = length;
	}

	@Override
	public void run() {
		int printedFibonacci[] = fibonacci.fibonacci(length);

		for (int i = printedFibonacci.length - 1; i >= 0; i--) {
			System.out.print(printedFibonacci[i] + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
