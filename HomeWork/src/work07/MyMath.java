package work07;

/* Створити клас MyMath. В ньому створити 2-3 константи і 3-4 статичні методи. 
 * Константи і методи повинні бути математичного характеру. 
 */
import java.text.DecimalFormat;

public class MyMath {
	private static final String FORMAT = "#0.00";
	private static final double PI = 3.14;
	private static final int MIN_INTEGER = Integer.MIN_VALUE;

	public static int abc(int value) {
		if (value > 0) {
			return value;
		} else if (value == MIN_INTEGER) {
			return value;
		} else {
			return value * (-1);
		}
	}

	public static String averageForTwoValues(int value1, int value2) {
		double d = (double) (value1 + value2) / 2;
		String formattedDouble = new DecimalFormat(FORMAT).format(d);
		return formattedDouble;
	}

	public static String squareCircle(int radius) {
		double d = (double) PI * (radius * radius);
		String formattedDouble = new DecimalFormat(FORMAT).format(d);
		return formattedDouble;
	}

	public static String circuit(int radius) {
		double d = (double) PI * 2 * radius;
		String formattedDouble = new DecimalFormat(FORMAT).format(d);
		return formattedDouble;
	}
}
