package work20;

public class Fibonacci {
	public int[] fibonacci(int max) {
		int[] fibonacci = new int[max];
		int value1 = 1;
		int value2 = 1;
		int value3;
		fibonacci[0] = value1;
		fibonacci[1] = value2;

		for (int i = 2; i <= fibonacci.length - 1; i++) {
			value3 = value1 + value2;
			fibonacci[i] = value3;
			value1 = value2;
			value2 = value3;
		}
		return fibonacci;
	}
}
